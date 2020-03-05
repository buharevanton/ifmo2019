package awstemplambda;


import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.DeleteObjectRequest;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main implements RequestStreamHandler {
    public void handleRequest(InputStream inputStream, OutputStream outputStream, Context context) throws IOException {
        AWSCredentials awsCredentials = new BasicAWSCredentials("***********************","*************************");
        AmazonS3 amazonS3 = AmazonS3ClientBuilder.standard()
                .withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).withRegion(Regions.US_WEST_1)
                .build();
        String bucketName = "aws-course-temp2";
        amazonS3.deleteObject(new DeleteObjectRequest(bucketName, "text.txt"));
    }
}
