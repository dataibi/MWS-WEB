package eu.dandelion;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
// import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.*;
import org.json.*;

public class EntityExtractionService {

	private static String apiUrl = "https://api.dandelion.eu/datatxt/nex/v1";
	
	public static ArrayList<DandelionDataObject> postText(String text) throws HttpException
	{
		DefaultHttpClient httpClient = new DefaultHttpClient();
		
		// URIBuilder builder;
		HttpPost method;
		StringBuffer jsonString = new StringBuffer();
		try {
			// builder = new URIBuilder(apiUrl);
			// builder.setParameter("$app_id", "0265a8b0").setParameter("$app_key", "a0024056b204587f4564687f55e7ab85").setParameter("text", text);

			
			List<NameValuePair> formparams = new ArrayList<NameValuePair>();
			formparams.add(new BasicNameValuePair("text", text));
			formparams.add(new BasicNameValuePair("$app_id", "0265a8b0"));
			formparams.add(new BasicNameValuePair("$app_key", "a0024056b204587f4564687f55e7ab85"));
			UrlEncodedFormEntity entity = new UrlEncodedFormEntity(formparams, Consts.UTF_8);
			
			
			
		    method = new HttpPost(apiUrl);
		    method.setHeader("ContentType","application/x-www-form-urlencoded;charset=UTF-8");
		    method.setHeader("Accept", "application/json");
		    method.setEntity(entity);
		    
		 // Send POST request

		    int statusCode;
		    
		    HttpResponse response = httpClient.execute(method);
		    statusCode = response.getStatusLine().getStatusCode();
		    
			if (statusCode != HttpStatus.SC_OK) {
	        	System.err.println("Method failed: " + response.getStatusLine());
	        }

		    InputStream rstream = null;
		    rstream = response.getEntity().getContent(); 

	        BufferedReader br = new BufferedReader(new InputStreamReader(rstream));
	        String line;

	        while ((line = br.readLine()) != null) {
	            jsonString.append(line);
                jsonString.append("\n");
	        }
	//        System.out.println(jsonString);
	        br.close();
		    
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		DandelionDataObject dataObj;
		ArrayList<DandelionDataObject> objList = new ArrayList<DandelionDataObject>();
		try{
			JSONObject obj = new JSONObject(jsonString.toString());
		//	String time = obj.getJSONObject("time").getString("time");
	        if (obj.has("annotations")){
				JSONArray arr = obj.getJSONArray("annotations");
				for (int i = 0; i < arr.length(); i++)
				{
					dataObj = new DandelionDataObject();
				    dataObj.setWordStartPosition(arr.getJSONObject(i).getLong("start"));
				    dataObj.setWordEndPosition(arr.getJSONObject(i).getLong("end"));
				    dataObj.setSpot(arr.getJSONObject(i).getString("spot"));
				    dataObj.setConfidence(arr.getJSONObject(i).getDouble("confidence"));
				    dataObj.setId(arr.getJSONObject(i).getLong("id"));
				    dataObj.setTitle(arr.getJSONObject(i).getString("title"));
				    dataObj.setUri(arr.getJSONObject(i).getString("uri"));
				    dataObj.setLabel(arr.getJSONObject(i).getString("label"));
				    objList.add(dataObj);
				}
	        }else
				System.out.println("No Annotation found!");
		}
		catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return objList;
	}

}