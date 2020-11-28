package util;


public interface APIUtil {

	public static final String BASE_URI="http://localhost:8080";
	public static final String WIREMOCK_BASE_URI ="http://localhost" ;
	public static final int WIREMOCK_PORT =9876;
	public static final String WIREMOCK_ENDPOINT="/pl/80-863" ;
	public static final String ALL_COUNTRY_URI= BASE_URI+"/api/country/country/get/all";
	public static final String ISO2_COUNTRY_URI= BASE_URI+"/api/country/get/iso2code/IN";
	public static final String ISO3_COUNTRY_URI= BASE_URI+"/api/country/get/iso3code/IND";
}