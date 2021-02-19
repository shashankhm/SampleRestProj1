package com.sh.RestProj.config;



public class AResourceConfig {

/*    public AmazonS3 amazonS3Local(){

        ClientConfiguration clientConfiguration = new ClientConfiguration();
        clientConfiguration.setProxyHost("");
        clientConfiguration.setProxyPort(8080);

        AmazonS3 amazonS3 = AmazonS3ClientBuilder.standard().withClientConfiguration(clientConfiguration)
                .withCredentials(new ProfileCredentialsProvider("profile")).withRegion("East").build();

        return amazonS3;
    }

    @Profile("!local")
    public AmazonS3 amazonS3(){

        AmazonS3 amazonS3 = AmazonS3ClientBuilder.standard()
                .withCredentials(new DefaultAWSCredentialsProviderChain()).withRegion("East").build();

        return amazonS3;
    }*/
}
