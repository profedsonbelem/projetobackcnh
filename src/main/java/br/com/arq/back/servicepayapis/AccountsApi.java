package br.com.arq.back.servicepayapis;
import javax.ws.rs.core.GenericType;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.client.Pair;
import com.docusign.esign.model.AccountIdentityVerificationResponse;
import com.docusign.esign.model.AccountInformation;
import com.docusign.esign.model.AccountPasswordRules;
import com.docusign.esign.model.AccountSettingsInformation;
import com.docusign.esign.model.AccountSharedAccess;
import com.docusign.esign.model.AccountSignature;
import com.docusign.esign.model.AccountSignatureDefinition;
import com.docusign.esign.model.AccountSignatureProviders;
import com.docusign.esign.model.AccountSignaturesInformation;
import com.docusign.esign.model.BillingChargeResponse;
import com.docusign.esign.model.Brand;
import com.docusign.esign.model.BrandResources;
import com.docusign.esign.model.BrandResourcesList;
import com.docusign.esign.model.BrandsRequest;
import com.docusign.esign.model.BrandsResponse;
import com.docusign.esign.model.CaptiveRecipientInformation;
import com.docusign.esign.model.ConsumerDisclosure;
import com.docusign.esign.model.CustomField;
import com.docusign.esign.model.CustomFields;
import com.docusign.esign.model.ENoteConfiguration;
import com.docusign.esign.model.EnvelopePurgeConfiguration;
import com.docusign.esign.model.FavoriteTemplatesInfo;
import com.docusign.esign.model.FileTypeList;
import com.docusign.esign.model.NewAccountDefinition;
import com.docusign.esign.model.NewAccountSummary;
import com.docusign.esign.model.NotificationDefaults;
import com.docusign.esign.model.PaymentGatewayAccountsInfo;
import com.docusign.esign.model.PermissionProfile;
import com.docusign.esign.model.PermissionProfileInformation;
import com.docusign.esign.model.ProvisioningInformation;
import com.docusign.esign.model.RecipientNamesResponse;
import com.docusign.esign.model.ReportInProductCsvRunRequest;
import com.docusign.esign.model.ReportInProductGet;
import com.docusign.esign.model.ReportInProductList;
import com.docusign.esign.model.ReportInProductRunRequest;
import com.docusign.esign.model.ReportInProductRunResponse;
import com.docusign.esign.model.ReportInProductSaveResponse;
import com.docusign.esign.model.SupportedLanguages;
import com.docusign.esign.model.TabAccountSettings;
import com.docusign.esign.model.UserPasswordRules;
import com.docusign.esign.model.Watermark;

 
 



public class AccountsApi {
  private ApiClient apiClient;

  public AccountsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AccountsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

 
  public class CreateOptions
  {
  private String previewBillingPlan = null;
 
  public void setPreviewBillingPlan(String previewBillingPlan) {
    this.previewBillingPlan = previewBillingPlan;
  }

  public String getPreviewBillingPlan() {
    return this.previewBillingPlan;
  }
  }

   /**
   * Creates new accounts.
   * Creates new DocuSign service accounts.  This is used to create multiple DocuSign accounts with one call. It uses the same information and formats as the normal a  [Accounts:create](accounts_create) call with the information included within a &#x60;newAccountRequests&#x60; element. A maximum of 100 new accounts can be created at one time.  Note that the structure of the XML request is slightly different than the JSON request, in that the new account information is included in a &#x60;newAccountDefinition&#x60; property inside the &#x60;newAccountRequests&#x60; element. Response  The response returns the new account ID, password and the default user information for each newly created account.  A 201 code is returned if the call succeeded.  While the call may have succeed, some of the individual account requests may have failed. In the case of failures to create the account,  an &#x60;errorDetails&#x60; node is added in the response to each specific request that failed.
   * @param newAccountDefinition  (optional)
   * @return NewAccountSummary
   */ 
  public NewAccountSummary create(NewAccountDefinition newAccountDefinition) throws ApiException, Exception {
    return create(newAccountDefinition, null);
  }

  /**
   * Creates new accounts.
   * Creates new DocuSign service accounts.  This is used to create multiple DocuSign accounts with one call. It uses the same information and formats as the normal a  [Accounts:create](accounts_create) call with the information included within a &#x60;newAccountRequests&#x60; element. A maximum of 100 new accounts can be created at one time.  Note that the structure of the XML request is slightly different than the JSON request, in that the new account information is included in a &#x60;newAccountDefinition&#x60; property inside the &#x60;newAccountRequests&#x60; element. Response  The response returns the new account ID, password and the default user information for each newly created account.  A 201 code is returned if the call succeeded.  While the call may have succeed, some of the individual account requests may have failed. In the case of failures to create the account,  an &#x60;errorDetails&#x60; node is added in the response to each specific request that failed.
   * @param newAccountDefinition  (optional)
   * @param options for modifying the method behavior.
   * @return NewAccountSummary
   * @throws ApiException if fails to make API call
 * @throws br.com.arq.back.payclients.ApiException 
   */
  public NewAccountSummary create(NewAccountDefinition newAccountDefinition, AccountsApi.CreateOptions options) throws ApiException, br.com.arq.back.payclients.ApiException {
    Object localVarPostBody = newAccountDefinition;
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("preview_billing_plan", options.previewBillingPlan));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<NewAccountSummary> localVarReturnType = new GenericType<NewAccountSummary>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Adds/updates one or more account signatures. This request may include images in multi-part format. 
  /// </summary>
  public class CreateAccountSignaturesOptions
  {
  private String decodeOnly = null;
  /*
   * 
   */
  public void setDecodeOnly(String decodeOnly) {
    this.decodeOnly = decodeOnly;
  }

  public String getDecodeOnly() {
    return this.decodeOnly;
  }
  }

 
  public AccountSignaturesInformation createAccountSignatures(String accountId, AccountSignaturesInformation accountSignaturesInformation) throws ApiException, Exception {
    return createAccountSignatures(accountId, accountSignaturesInformation, null);
  }

 
  public AccountSignaturesInformation createAccountSignatures(String accountId, AccountSignaturesInformation accountSignaturesInformation, AccountsApi.CreateAccountSignaturesOptions options) throws ApiException, br.com.arq.back.payclients.ApiException {
    Object localVarPostBody = accountSignaturesInformation;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createAccountSignatures");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/signatures"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("decode_only", options.decodeOnly));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<AccountSignaturesInformation> localVarReturnType = new GenericType<AccountSignaturesInformation>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Creates one or more brand profile files for the account.
   * Creates one or more brand profile files for the account. The Account Branding feature (accountSettings properties &#x60;canSelfBrandSend&#x60; and &#x60;canSelfBrandSig&#x60;) must be set to **true** for the account to use this call.  An error is returned if &#x60;brandId&#x60; property for a brand profile is already set for the account. To upload a new version of an existing brand profile, you must delete the profile and then upload the newer version.  When brand profile files are being uploaded, they must be combined into one zip file and the &#x60;Content-Type&#x60; must be &#x60;application/zip&#x60;.
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param brand  (optional)
   * @return BrandsResponse
   * @throws ApiException if fails to make API call
   */
  public BrandsResponse createBrand(String accountId, Brand brand) throws ApiException {
    Object localVarPostBody = brand;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createBrand");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/brands"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<BrandsResponse> localVarReturnType = new GenericType<BrandsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Creates an acount custom field. 
  /// </summary>
  public class CreateCustomFieldOptions
  {
  private String applyToTemplates = null;
  /*
   * 
   */
  public void setApplyToTemplates(String applyToTemplates) {
    this.applyToTemplates = applyToTemplates;
  }

  public String getApplyToTemplates() {
    return this.applyToTemplates;
  }
  }

   /**
   * Creates an acount custom field.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param customField  (optional)
   * @return CustomFields
   */ 
  public CustomFields createCustomField(String accountId, CustomField customField) throws ApiException {
    return createCustomField(accountId, customField, null);
  }

  /**
   * Creates an acount custom field.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param customField  (optional)
   * @param options for modifying the method behavior.
   * @return CustomFields
   * @throws ApiException if fails to make API call
   */
  public CustomFields createCustomField(String accountId, CustomField customField, AccountsApi.CreateCustomFieldOptions options) throws ApiException {
    Object localVarPostBody = customField;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createCustomField");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/custom_fields"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("apply_to_templates", options.applyToTemplates));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<CustomFields> localVarReturnType = new GenericType<CustomFields>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Creates a new permission profile in the specified account. 
  /// </summary>
  public class CreatePermissionProfileOptions
  {
  private String include = null;
  /*
   * 
   */
  public void setInclude(String include) {
    this.include = include;
  }

  public String getInclude() {
    return this.include;
  }
  }

   /**
   * Creates a new permission profile in the specified account.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param permissionProfile  (optional)
   * @return PermissionProfile
   */ 
  public PermissionProfile createPermissionProfile(String accountId, PermissionProfile permissionProfile) throws ApiException {
    return createPermissionProfile(accountId, permissionProfile, null);
  }

  /**
   * Creates a new permission profile in the specified account.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param permissionProfile  (optional)
   * @param options for modifying the method behavior.
   * @return PermissionProfile
   * @throws ApiException if fails to make API call
 * @throws ApiException 
   */
  public PermissionProfile createPermissionProfile(String accountId, PermissionProfile permissionProfile, AccountsApi.CreatePermissionProfileOptions options) throws ApiException, ApiException {
    Object localVarPostBody = permissionProfile;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createPermissionProfile");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/permission_profiles"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include", options.include));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<PermissionProfile> localVarReturnType = new GenericType<PermissionProfile>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Creates a customized report
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param reportInProductRunRequest  (optional)
   * @return ReportInProductSaveResponse
   * @throws ApiException if fails to make API call
   */
  public ReportInProductSaveResponse createReportInProductCreate(String accountId, ReportInProductRunRequest reportInProductRunRequest) throws ApiException {
    Object localVarPostBody = reportInProductRunRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createReportInProductCreate");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/reports"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<ReportInProductSaveResponse> localVarReturnType = new GenericType<ReportInProductSaveResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Deletes the specified account.
   * This closes the specified account. You must be an account admin to close your account. Once closed, an account must be reopened by DocuSign.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @throws ApiException if fails to make API call
   */
  public void delete(String accountId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling delete");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }

  /**
   * Close the specified signature by Id.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAccountSignature(String accountId, String signatureId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteAccountSignature");
    }
    
    // verify the required parameter 'signatureId' is set
    if (signatureId == null) {
      throw new ApiException(400, "Missing the required parameter 'signatureId' when calling deleteAccountSignature");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/signatures/{signatureId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "signatureId" + "\\}", apiClient.escapeString(signatureId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }

  /**
   * Deletes a signature, initials, or stamps image.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @param imageType One of **signature_image** or **initials_image**. (required)
   * @return AccountSignature
   * @throws ApiException if fails to make API call
   */
  public AccountSignature deleteAccountSignatureImage(String accountId, String signatureId, String imageType) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteAccountSignatureImage");
    }
    
    // verify the required parameter 'signatureId' is set
    if (signatureId == null) {
      throw new ApiException(400, "Missing the required parameter 'signatureId' when calling deleteAccountSignatureImage");
    }
    
    // verify the required parameter 'imageType' is set
    if (imageType == null) {
      throw new ApiException(400, "Missing the required parameter 'imageType' when calling deleteAccountSignatureImage");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/signatures/{signatureId}/{imageType}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "signatureId" + "\\}", apiClient.escapeString(signatureId.toString()))
      .replaceAll("\\{" + "imageType" + "\\}", apiClient.escapeString(imageType.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<AccountSignature> localVarReturnType = new GenericType<AccountSignature>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Removes a brand.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param brandId The unique identifier of a brand. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteBrand(String accountId, String brandId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteBrand");
    }
    
    // verify the required parameter 'brandId' is set
    if (brandId == null) {
      throw new ApiException(400, "Missing the required parameter 'brandId' when calling deleteBrand");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/brands/{brandId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "brandId" + "\\}", apiClient.escapeString(brandId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }

  /**
   * Delete one branding logo.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param brandId The unique identifier of a brand. (required)
   * @param logoType One of **Primary**, **Secondary** or **Email**. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteBrandLogoByType(String accountId, String brandId, String logoType) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteBrandLogoByType");
    }
    
    // verify the required parameter 'brandId' is set
    if (brandId == null) {
      throw new ApiException(400, "Missing the required parameter 'brandId' when calling deleteBrandLogoByType");
    }
    
    // verify the required parameter 'logoType' is set
    if (logoType == null) {
      throw new ApiException(400, "Missing the required parameter 'logoType' when calling deleteBrandLogoByType");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/brands/{brandId}/logos/{logoType}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "brandId" + "\\}", apiClient.escapeString(brandId.toString()))
      .replaceAll("\\{" + "logoType" + "\\}", apiClient.escapeString(logoType.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }

  /**
   * Deletes one or more brand profiles.
   * Deletes one or more brand profiles from an account. The Account Branding feature (accountSettings properties &#x60;canSelfBrandSend&#x60; and &#x60;canSelfBrandSend&#x60;) must be set to **true** to use this call.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param brandsRequest  (optional)
   * @return BrandsResponse
   * @throws ApiException if fails to make API call
   */
  public BrandsResponse deleteBrands(String accountId, BrandsRequest brandsRequest) throws ApiException {
    Object localVarPostBody = brandsRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteBrands");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/brands"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<BrandsResponse> localVarReturnType = new GenericType<BrandsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Deletes the signature for one or more captive recipient records.
   * Deletes the signature for one or more captive recipient records; it is primarily used for testing. This provides a way to reset the signature associated with a client user ID so that a new signature can be created the next time the client user ID is used.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param recipientPart  (required)
   * @param captiveRecipientInformation  (optional)
   * @return CaptiveRecipientInformation
   * @throws ApiException if fails to make API call
   */
  public CaptiveRecipientInformation deleteCaptiveRecipient(String accountId, String recipientPart, CaptiveRecipientInformation captiveRecipientInformation) throws ApiException {
    Object localVarPostBody = captiveRecipientInformation;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteCaptiveRecipient");
    }
    
    // verify the required parameter 'recipientPart' is set
    if (recipientPart == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientPart' when calling deleteCaptiveRecipient");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/captive_recipients/{recipientPart}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "recipientPart" + "\\}", apiClient.escapeString(recipientPart.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<CaptiveRecipientInformation> localVarReturnType = new GenericType<CaptiveRecipientInformation>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Delete an existing account custom field. 
  /// </summary>
  public class DeleteCustomFieldOptions
  {
  private String applyToTemplates = null;
  /*
   * 
   */
  public void setApplyToTemplates(String applyToTemplates) {
    this.applyToTemplates = applyToTemplates;
  }

  public String getApplyToTemplates() {
    return this.applyToTemplates;
  }
  }

   /**
   * Delete an existing account custom field.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param customFieldId  (required)
   * @return void
   */ 
  public void deleteCustomField(String accountId, String customFieldId) throws ApiException {
    deleteCustomField(accountId, customFieldId, null);
  }

  /**
   * Delete an existing account custom field.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param customFieldId  (required)
   * @param options for modifying the method behavior.
   * @throws ApiException if fails to make API call
   */
  public void deleteCustomField(String accountId, String customFieldId, AccountsApi.DeleteCustomFieldOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteCustomField");
    }
    
    // verify the required parameter 'customFieldId' is set
    if (customFieldId == null) {
      throw new ApiException(400, "Missing the required parameter 'customFieldId' when calling deleteCustomField");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/custom_fields/{customFieldId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "customFieldId" + "\\}", apiClient.escapeString(customFieldId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("apply_to_templates", options.applyToTemplates));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }

  /**
   * Deletes configuration information for the eNote eOriginal integration.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteENoteConfiguration(String accountId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteENoteConfiguration");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/settings/enote_configuration"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /// <summary>
  /// Deletes a permissions profile within the specified account. 
  /// </summary>
  public class DeletePermissionProfileOptions
  {
  private String moveUsersTo = null;
  /*
   * 
   */
  public void setMoveUsersTo(String moveUsersTo) {
    this.moveUsersTo = moveUsersTo;
  }

  public String getMoveUsersTo() {
    return this.moveUsersTo;
  }
  }

   /**
   * Deletes a permissions profile within the specified account.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param permissionProfileId  (required)
   * @return void
   */ 
  public void deletePermissionProfile(String accountId, String permissionProfileId) throws ApiException {
    deletePermissionProfile(accountId, permissionProfileId, null);
  }

  /**
   * Deletes a permissions profile within the specified account.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param permissionProfileId  (required)
   * @param options for modifying the method behavior.
   * @throws ApiException if fails to make API call
   */
  public void deletePermissionProfile(String accountId, String permissionProfileId, AccountsApi.DeletePermissionProfileOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deletePermissionProfile");
    }
    
    // verify the required parameter 'permissionProfileId' is set
    if (permissionProfileId == null) {
      throw new ApiException(400, "Missing the required parameter 'permissionProfileId' when calling deletePermissionProfile");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/permission_profiles/{permissionProfileId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "permissionProfileId" + "\\}", apiClient.escapeString(permissionProfileId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("move_users_to", options.moveUsersTo));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }

  /**
   * Removes a customized report
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param id  (required)
   * @return ReportInProductSaveResponse
   * @throws ApiException if fails to make API call
   */
  public ReportInProductSaveResponse deleteReportInProduct(String accountId, String id) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteReportInProduct");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteReportInProduct");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/reports/{id}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<ReportInProductSaveResponse> localVarReturnType = new GenericType<ReportInProductSaveResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Get the list of identity verification options for an account
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return AccountIdentityVerificationResponse
   * @throws ApiException if fails to make API call
   */
  public AccountIdentityVerificationResponse getAccountIdentityVerification(String accountId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getAccountIdentityVerification");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/identity_verification"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<AccountIdentityVerificationResponse> localVarReturnType = new GenericType<AccountIdentityVerificationResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Retrieves the account information for the specified account. Retrieves the account information for the specified account.  **Response** The &#x60;canUpgrade&#x60; property contains is a Boolean that indicates whether the account can be upgraded through the API. 
  /// </summary>
  public class GetAccountInformationOptions
  {
  private String includeAccountSettings = null;
  /*
   * When set to **true**, includes the account settings for the account in the response. 
   */
  public void setIncludeAccountSettings(String includeAccountSettings) {
    this.includeAccountSettings = includeAccountSettings;
  }

  public String getIncludeAccountSettings() {
    return this.includeAccountSettings;
  }
  }

   /**
   * Retrieves the account information for the specified account.
   * Retrieves the account information for the specified account.  **Response** The &#x60;canUpgrade&#x60; property contains is a Boolean that indicates whether the account can be upgraded through the API. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return AccountInformation
   */ 
  public AccountInformation getAccountInformation(String accountId) throws ApiException {
    return getAccountInformation(accountId, null);
  }

  /**
   * Retrieves the account information for the specified account.
   * Retrieves the account information for the specified account.  **Response** The &#x60;canUpgrade&#x60; property contains is a Boolean that indicates whether the account can be upgraded through the API. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return AccountInformation
   * @throws ApiException if fails to make API call
   */
  public AccountInformation getAccountInformation(String accountId, AccountsApi.GetAccountInformationOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getAccountInformation");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_account_settings", options.includeAccountSettings));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<AccountInformation> localVarReturnType = new GenericType<AccountInformation>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Retrieves an account settings comparison.
   * 
   * @param organizationId  (required)
   * @param resultId  (required)
   * @throws ApiException if fails to make API call
   */
  public void getAccountSettingsExport(String organizationId, String resultId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'organizationId' is set
    if (organizationId == null) {
      throw new ApiException(400, "Missing the required parameter 'organizationId' when calling getAccountSettingsExport");
    }
    
    // verify the required parameter 'resultId' is set
    if (resultId == null) {
      throw new ApiException(400, "Missing the required parameter 'resultId' when calling getAccountSettingsExport");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/organization_exports/{organizationId}/account_settings/{resultId}"
      .replaceAll("\\{" + "organizationId" + "\\}", apiClient.escapeString(organizationId.toString()))
      .replaceAll("\\{" + "resultId" + "\\}", apiClient.escapeString(resultId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };


    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }

  /**
   * Returns information about a single signature by specifed signatureId.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @return AccountSignature
   * @throws ApiException if fails to make API call
   */
  public AccountSignature getAccountSignature(String accountId, String signatureId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getAccountSignature");
    }
    
    // verify the required parameter 'signatureId' is set
    if (signatureId == null) {
      throw new ApiException(400, "Missing the required parameter 'signatureId' when calling getAccountSignature");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/signatures/{signatureId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "signatureId" + "\\}", apiClient.escapeString(signatureId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<AccountSignature> localVarReturnType = new GenericType<AccountSignature>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Returns a signature, initials, or stamps image. 
  /// </summary>
  public class GetAccountSignatureImageOptions
  {
  private String includeChrome = null;
  /*
   * 
   */
  public void setIncludeChrome(String includeChrome) {
    this.includeChrome = includeChrome;
  }

  public String getIncludeChrome() {
    return this.includeChrome;
  }
  }

   /**
   * Returns a signature, initials, or stamps image.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @param imageType One of **signature_image** or **initials_image**. (required)
   * @return byte[]
   */ 
  public byte[] getAccountSignatureImage(String accountId, String signatureId, String imageType) throws ApiException {
    return getAccountSignatureImage(accountId, signatureId, imageType, null);
  }

  /**
   * Returns a signature, initials, or stamps image.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @param imageType One of **signature_image** or **initials_image**. (required)
   * @param options for modifying the method behavior.
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public byte[] getAccountSignatureImage(String accountId, String signatureId, String imageType, AccountsApi.GetAccountSignatureImageOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getAccountSignatureImage");
    }
    
    // verify the required parameter 'signatureId' is set
    if (signatureId == null) {
      throw new ApiException(400, "Missing the required parameter 'signatureId' when calling getAccountSignatureImage");
    }
    
    // verify the required parameter 'imageType' is set
    if (imageType == null) {
      throw new ApiException(400, "Missing the required parameter 'imageType' when calling getAccountSignatureImage");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/signatures/{signatureId}/{imageType}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "signatureId" + "\\}", apiClient.escapeString(signatureId.toString()))
      .replaceAll("\\{" + "imageType" + "\\}", apiClient.escapeString(imageType.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_chrome", options.includeChrome));
    }

    

    

    final String[] localVarAccepts = {
      "image/gif"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<byte[]> localVarReturnType = new GenericType<byte[]>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Returns the managed signature definitions for the account 
  /// </summary>
  public class GetAccountSignaturesOptions
  {
  private String stampFormat = null;
  private String stampName = null;
  private String stampType = null;
  /*
   * 
   */
  public void setStampFormat(String stampFormat) {
    this.stampFormat = stampFormat;
  }

  public String getStampFormat() {
    return this.stampFormat;
  }
  /*
   * 
   */
  public void setStampName(String stampName) {
    this.stampName = stampName;
  }

  public String getStampName() {
    return this.stampName;
  }
  /*
   * 
   */
  public void setStampType(String stampType) {
    this.stampType = stampType;
  }

  public String getStampType() {
    return this.stampType;
  }
  }

   /**
   * Returns the managed signature definitions for the account
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return AccountSignaturesInformation
   */ 
  public AccountSignaturesInformation getAccountSignatures(String accountId) throws ApiException {
    return getAccountSignatures(accountId, null);
  }

  /**
   * Returns the managed signature definitions for the account
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return AccountSignaturesInformation
   * @throws ApiException if fails to make API call
   */
  public AccountSignaturesInformation getAccountSignatures(String accountId, AccountsApi.GetAccountSignaturesOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getAccountSignatures");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/signatures"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("stamp_format", options.stampFormat));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("stamp_name", options.stampName));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("stamp_type", options.stampType));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<AccountSignaturesInformation> localVarReturnType = new GenericType<AccountSignaturesInformation>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Returns tab settings list for specified account
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return TabAccountSettings
   * @throws ApiException if fails to make API call
   */
  public TabAccountSettings getAccountTabSettings(String accountId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getAccountTabSettings");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/settings/tabs"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<TabAccountSettings> localVarReturnType = new GenericType<TabAccountSettings>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Get all payment gateway account for the provided accountId
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return PaymentGatewayAccountsInfo
   * @throws ApiException if fails to make API call
   */
  public PaymentGatewayAccountsInfo getAllPaymentGatewayAccounts(String accountId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getAllPaymentGatewayAccounts");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/payment_gateway_accounts"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<PaymentGatewayAccountsInfo> localVarReturnType = new GenericType<PaymentGatewayAccountsInfo>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Gets list of recurring and usage charges for the account. Retrieves the list of recurring and usage charges for the account. This can be used to determine the charge structure and usage of charge plan items.   Privileges required: account administrator 
  /// </summary>
  public class GetBillingChargesOptions
  {
  private String includeCharges = null;
  /*
   * Specifies which billing charges to return. Valid values are:  * envelopes * seats  
   */
  public void setIncludeCharges(String includeCharges) {
    this.includeCharges = includeCharges;
  }

  public String getIncludeCharges() {
    return this.includeCharges;
  }
  }

   /**
   * Gets list of recurring and usage charges for the account.
   * Retrieves the list of recurring and usage charges for the account. This can be used to determine the charge structure and usage of charge plan items.   Privileges required: account administrator 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return BillingChargeResponse
   */ 
  public BillingChargeResponse getBillingCharges(String accountId) throws ApiException {
    return getBillingCharges(accountId, null);
  }

  /**
   * Gets list of recurring and usage charges for the account.
   * Retrieves the list of recurring and usage charges for the account. This can be used to determine the charge structure and usage of charge plan items.   Privileges required: account administrator 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return BillingChargeResponse
   * @throws ApiException if fails to make API call
   */
  public BillingChargeResponse getBillingCharges(String accountId, AccountsApi.GetBillingChargesOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getBillingCharges");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/billing_charges"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_charges", options.includeCharges));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<BillingChargeResponse> localVarReturnType = new GenericType<BillingChargeResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Get information for a specific brand. 
  /// </summary>
  public class GetBrandOptions
  {
  private String includeExternalReferences = null;
  private String includeLogos = null;
  /*
   * 
   */
  public void setIncludeExternalReferences(String includeExternalReferences) {
    this.includeExternalReferences = includeExternalReferences;
  }

  public String getIncludeExternalReferences() {
    return this.includeExternalReferences;
  }
  /*
   * 
   */
  public void setIncludeLogos(String includeLogos) {
    this.includeLogos = includeLogos;
  }

  public String getIncludeLogos() {
    return this.includeLogos;
  }
  }

   /**
   * Get information for a specific brand.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param brandId The unique identifier of a brand. (required)
   * @return Brand
   */ 
  public Brand getBrand(String accountId, String brandId) throws ApiException {
    return getBrand(accountId, brandId, null);
  }

  /**
   * Get information for a specific brand.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param brandId The unique identifier of a brand. (required)
   * @param options for modifying the method behavior.
   * @return Brand
   * @throws ApiException if fails to make API call
   */
  public Brand getBrand(String accountId, String brandId, AccountsApi.GetBrandOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getBrand");
    }
    
    // verify the required parameter 'brandId' is set
    if (brandId == null) {
      throw new ApiException(400, "Missing the required parameter 'brandId' when calling getBrand");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/brands/{brandId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "brandId" + "\\}", apiClient.escapeString(brandId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_external_references", options.includeExternalReferences));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_logos", options.includeLogos));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<Brand> localVarReturnType = new GenericType<Brand>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Export a specific brand.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param brandId The unique identifier of a brand. (required)
   * @throws ApiException if fails to make API call
   */
  public void getBrandExportFile(String accountId, String brandId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getBrandExportFile");
    }
    
    // verify the required parameter 'brandId' is set
    if (brandId == null) {
      throw new ApiException(400, "Missing the required parameter 'brandId' when calling getBrandExportFile");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/brands/{brandId}/file"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "brandId" + "\\}", apiClient.escapeString(brandId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };


    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }

  /**
   * Obtains the specified image for a brand.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param brandId The unique identifier of a brand. (required)
   * @param logoType One of **Primary**, **Secondary** or **Email**. (required)
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public byte[] getBrandLogoByType(String accountId, String brandId, String logoType) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getBrandLogoByType");
    }
    
    // verify the required parameter 'brandId' is set
    if (brandId == null) {
      throw new ApiException(400, "Missing the required parameter 'brandId' when calling getBrandLogoByType");
    }
    
    // verify the required parameter 'logoType' is set
    if (logoType == null) {
      throw new ApiException(400, "Missing the required parameter 'logoType' when calling getBrandLogoByType");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/brands/{brandId}/logos/{logoType}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "brandId" + "\\}", apiClient.escapeString(brandId.toString()))
      .replaceAll("\\{" + "logoType" + "\\}", apiClient.escapeString(logoType.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "image/png"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<byte[]> localVarReturnType = new GenericType<byte[]>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Returns the specified account&#39;s list of branding resources (metadata).
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param brandId The unique identifier of a brand. (required)
   * @return BrandResourcesList
   * @throws ApiException if fails to make API call
   */
  public BrandResourcesList getBrandResources(String accountId, String brandId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getBrandResources");
    }
    
    // verify the required parameter 'brandId' is set
    if (brandId == null) {
      throw new ApiException(400, "Missing the required parameter 'brandId' when calling getBrandResources");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/brands/{brandId}/resources"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "brandId" + "\\}", apiClient.escapeString(brandId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<BrandResourcesList> localVarReturnType = new GenericType<BrandResourcesList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Returns the specified branding resource file. 
  /// </summary>
  public class GetBrandResourcesByContentTypeOptions
  {
  private String langcode = null;
  private String returnMaster = null;
  /*
   * 
   */
  public void setLangcode(String langcode) {
    this.langcode = langcode;
  }

  public String getLangcode() {
    return this.langcode;
  }
  /*
   * 
   */
  public void setReturnMaster(String returnMaster) {
    this.returnMaster = returnMaster;
  }

  public String getReturnMaster() {
    return this.returnMaster;
  }
  }

   /**
   * Returns the specified branding resource file.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param brandId The unique identifier of a brand. (required)
   * @param resourceContentType  (required)
   * @return void
   */ 
  public void getBrandResourcesByContentType(String accountId, String brandId, String resourceContentType) throws ApiException {
    getBrandResourcesByContentType(accountId, brandId, resourceContentType, null);
  }

  /**
   * Returns the specified branding resource file.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param brandId The unique identifier of a brand. (required)
   * @param resourceContentType  (required)
   * @param options for modifying the method behavior.
   * @throws ApiException if fails to make API call
   */
  public void getBrandResourcesByContentType(String accountId, String brandId, String resourceContentType, AccountsApi.GetBrandResourcesByContentTypeOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getBrandResourcesByContentType");
    }
    
    // verify the required parameter 'brandId' is set
    if (brandId == null) {
      throw new ApiException(400, "Missing the required parameter 'brandId' when calling getBrandResourcesByContentType");
    }
    
    // verify the required parameter 'resourceContentType' is set
    if (resourceContentType == null) {
      throw new ApiException(400, "Missing the required parameter 'resourceContentType' when calling getBrandResourcesByContentType");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/brands/{brandId}/resources/{resourceContentType}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "brandId" + "\\}", apiClient.escapeString(brandId.toString()))
      .replaceAll("\\{" + "resourceContentType" + "\\}", apiClient.escapeString(resourceContentType.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("langcode", options.langcode));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("return_master", options.returnMaster));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };


    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }

  /**
   * Gets the Electronic Record and Signature Disclosure.
   * Retrieves the Electronic Record and Signature Disclosure, with HTML formatting, for the requested envelope recipient. This might be different than the current account disclosure depending on account settings, such as branding, and when the account disclosure was last updated. An optional query string can be included to return the language for the disclosure.  
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param langCode The simple type enumeration the language used in the response. The supported languages, with the language value shown in parenthesis, are:Arabic (ar), Armenian (hy), Bulgarian (bg), Czech (cs), Chinese Simplified (zh_CN), Chinese Traditional (zh_TW), Croatian (hr), Danish (da), Dutch (nl), English US (en), English UK (en_GB), Estonian (et), Farsi (fa), Finnish (fi), French (fr), French Canada (fr_CA), German (de), Greek (el), Hebrew (he), Hindi (hi), Hungarian (hu), Bahasa Indonesia (id), Italian (it), Japanese (ja), Korean (ko), Latvian (lv), Lithuanian (lt), Bahasa Melayu (ms), Norwegian (no), Polish (pl), Portuguese (pt), Portuguese Brazil (pt_BR), Romanian (ro), Russian (ru), Serbian (sr), Slovak (sk), Slovenian (sl), Spanish (es),Spanish Latin America (es_MX), Swedish (sv), Thai (th), Turkish (tr), Ukrainian (uk) and Vietnamese (vi). Additionally, the value can be set to Ã¯Â¿Â½browserÃ¯Â¿Â½ to automatically detect the browser language being used by the viewer and display the disclosure in that language. (required)
   * @return ConsumerDisclosure
   * @throws ApiException if fails to make API call
   */
  public ConsumerDisclosure getConsumerDisclosure(String accountId, String langCode) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getConsumerDisclosure");
    }
    
    // verify the required parameter 'langCode' is set
    if (langCode == null) {
      throw new ApiException(400, "Missing the required parameter 'langCode' when calling getConsumerDisclosure");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/consumer_disclosure/{langCode}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "langCode" + "\\}", apiClient.escapeString(langCode.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<ConsumerDisclosure> localVarReturnType = new GenericType<ConsumerDisclosure>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Gets the Electronic Record and Signature Disclosure for the account. Retrieves the Electronic Record and Signature Disclosure, with HTML formatting, associated with the account. You can use an optional query string to set the language for the disclosure.
  /// </summary>
  public class GetConsumerDisclosureDefaultOptions
  {
  private String langCode = null;
  /*
   * Specifies the language used in the response. The supported languages, with the language value shown in parenthesis, are: Arabic (ar), Armenian (hy), Bulgarian (bg), Czech (cs), Chinese Simplified (zh_CN), Chinese Traditional (zh_TW), Croatian (hr), Danish (da), Dutch (nl), English US (en), English UK (en_GB), Estonian (et), Farsi (fa), Finnish (fi), French (fr), French Canada (fr_CA), German (de), Greek (el), Hebrew (he), Hindi (hi), Hungarian (hu), Bahasa Indonesia (id), Italian (it), Japanese (ja), Korean (ko), Latvian (lv), Lithuanian (lt), Bahasa Melayu (ms), Norwegian (no), Polish (pl), Portuguese (pt), Portuguese Brazil (pt_BR), Romanian (ro), Russian (ru), Serbian (sr), Slovak (sk), Slovenian (sl), Spanish (es),Spanish Latin America (es_MX), Swedish (sv), Thai (th), Turkish (tr), Ukrainian (uk), and Vietnamese (vi).  Additionally, the value can be set to &#x60;browser&#x60; to automatically detect the browser language being used by the viewer and display the disclosure in that language.  
   */
  public void setLangCode(String langCode) {
    this.langCode = langCode;
  }

  public String getLangCode() {
    return this.langCode;
  }
  }

   /**
   * Gets the Electronic Record and Signature Disclosure for the account.
   * Retrieves the Electronic Record and Signature Disclosure, with HTML formatting, associated with the account. You can use an optional query string to set the language for the disclosure.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return ConsumerDisclosure
   */ 
  public ConsumerDisclosure getConsumerDisclosureDefault(String accountId) throws ApiException {
    return getConsumerDisclosureDefault(accountId, null);
  }

  /**
   * Gets the Electronic Record and Signature Disclosure for the account.
   * Retrieves the Electronic Record and Signature Disclosure, with HTML formatting, associated with the account. You can use an optional query string to set the language for the disclosure.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return ConsumerDisclosure
   * @throws ApiException if fails to make API call
   */
  public ConsumerDisclosure getConsumerDisclosureDefault(String accountId, AccountsApi.GetConsumerDisclosureDefaultOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getConsumerDisclosureDefault");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/consumer_disclosure"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("langCode", options.langCode));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<ConsumerDisclosure> localVarReturnType = new GenericType<ConsumerDisclosure>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Returns the configuration information for the eNote eOriginal integration.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return ENoteConfiguration
   * @throws ApiException if fails to make API call
   */
  public ENoteConfiguration getENoteConfiguration(String accountId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getENoteConfiguration");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/settings/enote_configuration"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<ENoteConfiguration> localVarReturnType = new GenericType<ENoteConfiguration>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Select envelope purge configuration.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return EnvelopePurgeConfiguration
   * @throws ApiException if fails to make API call
   */
  public EnvelopePurgeConfiguration getEnvelopePurgeConfiguration(String accountId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getEnvelopePurgeConfiguration");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/settings/envelope_purge_configuration"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<EnvelopePurgeConfiguration> localVarReturnType = new GenericType<EnvelopePurgeConfiguration>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Retrieves the list of favorited templates for this caller
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return FavoriteTemplatesInfo
   * @throws ApiException if fails to make API call
   */
  public FavoriteTemplatesInfo getFavoriteTemplates(String accountId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getFavoriteTemplates");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/favorite_templates"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<FavoriteTemplatesInfo> localVarReturnType = new GenericType<FavoriteTemplatesInfo>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Returns default user level settings for a specified account
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return NotificationDefaults
   * @throws ApiException if fails to make API call
   */
  public NotificationDefaults getNotificationDefaults(String accountId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getNotificationDefaults");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/settings/notification_defaults"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<NotificationDefaults> localVarReturnType = new GenericType<NotificationDefaults>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Get the password rules
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return AccountPasswordRules
   * @throws ApiException if fails to make API call
   */
  public AccountPasswordRules getPasswordRules(String accountId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getPasswordRules");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/settings/password_rules"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<AccountPasswordRules> localVarReturnType = new GenericType<AccountPasswordRules>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Get membership account password rules
   * 
   * @return UserPasswordRules
   * @throws ApiException if fails to make API call
   */
  public UserPasswordRules getPasswordRules_0() throws ApiException {
    Object localVarPostBody = "{}";
    
    // create path and map variables
    String localVarPath = "/v2.1/current_user/password_rules";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<UserPasswordRules> localVarReturnType = new GenericType<UserPasswordRules>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Returns a permissions profile in the specified account. 
  /// </summary>
  public class GetPermissionProfileOptions
  {
  private String include = null;
  /*
   * 
   */
  public void setInclude(String include) {
    this.include = include;
  }

  public String getInclude() {
    return this.include;
  }
  }

   /**
   * Returns a permissions profile in the specified account.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param permissionProfileId  (required)
   * @return PermissionProfile
   */ 
  public PermissionProfile getPermissionProfile(String accountId, String permissionProfileId) throws ApiException {
    return getPermissionProfile(accountId, permissionProfileId, null);
  }

  /**
   * Returns a permissions profile in the specified account.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param permissionProfileId  (required)
   * @param options for modifying the method behavior.
   * @return PermissionProfile
   * @throws ApiException if fails to make API call
   */
  public PermissionProfile getPermissionProfile(String accountId, String permissionProfileId, AccountsApi.GetPermissionProfileOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getPermissionProfile");
    }
    
    // verify the required parameter 'permissionProfileId' is set
    if (permissionProfileId == null) {
      throw new ApiException(400, "Missing the required parameter 'permissionProfileId' when calling getPermissionProfile");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/permission_profiles/{permissionProfileId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "permissionProfileId" + "\\}", apiClient.escapeString(permissionProfileId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include", options.include));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<PermissionProfile> localVarReturnType = new GenericType<PermissionProfile>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Retrieves the account provisioning information for the account.
   * Retrieves the account provisioning information for the account.
   * @return ProvisioningInformation
   * @throws ApiException if fails to make API call
   */
  public ProvisioningInformation getProvisioning() throws ApiException {
    Object localVarPostBody = "{}";
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/provisioning";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<ProvisioningInformation> localVarReturnType = new GenericType<ProvisioningInformation>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Gets the specified report
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param id  (required)
   * @return ReportInProductGet
   * @throws ApiException if fails to make API call
   */
  public ReportInProductGet getReportInProduct(String accountId, String id) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getReportInProduct");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getReportInProduct");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/reports/{id}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<ReportInProductGet> localVarReturnType = new GenericType<ReportInProductGet>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Gets the descriptors for all of an account&#39;s active reports (for listings)
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return ReportInProductList
   * @throws ApiException if fails to make API call
   */
  public ReportInProductList getReportInProductList(String accountId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getReportInProductList");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/reports"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<ReportInProductList> localVarReturnType = new GenericType<ReportInProductList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Gets list of supported languages for recipient language setting.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return SupportedLanguages
   * @throws ApiException if fails to make API call
   */
  public SupportedLanguages getSupportedLanguages(String accountId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getSupportedLanguages");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/supported_languages"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<SupportedLanguages> localVarReturnType = new GenericType<SupportedLanguages>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Get watermark information.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return Watermark
   * @throws ApiException if fails to make API call
   */
  public Watermark getWatermark(String accountId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getWatermark");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/watermark"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<Watermark> localVarReturnType = new GenericType<Watermark>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Get watermark preview.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param watermark  (optional)
   * @return Watermark
   * @throws ApiException if fails to make API call
   */
  public Watermark getWatermarkPreview(String accountId, Watermark watermark) throws ApiException {
    Object localVarPostBody = watermark;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getWatermarkPreview");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/watermark/preview"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<Watermark> localVarReturnType = new GenericType<Watermark>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Gets a list of brand profiles. Retrieves the list of brand profiles associated with the account and the default brand profiles. The Account Branding feature (accountSettings properties &#x60;canSelfBrandSend&#x60; and &#x60;canSelfBrandSend&#x60;)  must be set to **true** for the account to use this call.
  /// </summary>
  public class ListBrandsOptions
  {
  private String excludeDistributorBrand = null;
  private String includeLogos = null;
  /*
   * When set to **true**, excludes distributor brand information from the response set. 
   */
  public void setExcludeDistributorBrand(String excludeDistributorBrand) {
    this.excludeDistributorBrand = excludeDistributorBrand;
  }

  public String getExcludeDistributorBrand() {
    return this.excludeDistributorBrand;
  }
  /*
   * When set to **true**, returns the logos associated with the brand. 
   */
  public void setIncludeLogos(String includeLogos) {
    this.includeLogos = includeLogos;
  }

  public String getIncludeLogos() {
    return this.includeLogos;
  }
  }

   /**
   * Gets a list of brand profiles.
   * Retrieves the list of brand profiles associated with the account and the default brand profiles. The Account Branding feature (accountSettings properties &#x60;canSelfBrandSend&#x60; and &#x60;canSelfBrandSend&#x60;)  must be set to **true** for the account to use this call.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return BrandsResponse
   */ 
  public BrandsResponse listBrands(String accountId) throws ApiException {
    return listBrands(accountId, null);
  }

  /**
   * Gets a list of brand profiles.
   * Retrieves the list of brand profiles associated with the account and the default brand profiles. The Account Branding feature (accountSettings properties &#x60;canSelfBrandSend&#x60; and &#x60;canSelfBrandSend&#x60;)  must be set to **true** for the account to use this call.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return BrandsResponse
   * @throws ApiException if fails to make API call
   */
  public BrandsResponse listBrands(String accountId, AccountsApi.ListBrandsOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listBrands");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/brands"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("exclude_distributor_brand", options.excludeDistributorBrand));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_logos", options.includeLogos));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<BrandsResponse> localVarReturnType = new GenericType<BrandsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Gets a list of custom fields associated with the account.
   * Retrieves a list of envelope custom fields associated with the account. You can use these fields in the envelopes for your account to record information about the envelope, help search for envelopes and track information. The envelope custom fields are shown in the Envelope Settings section when a user is creating an envelope in the DocuSign member console. The envelope custom fields are not seen by the envelope recipients.  There are two types of envelope custom fields, text, and list. A text custom field lets the sender enter the value for the field. The list custom field lets the sender select the value of the field from a list you provide.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return CustomFields
   * @throws ApiException if fails to make API call
   */
  public CustomFields listCustomFields(String accountId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/custom_fields"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<CustomFields> localVarReturnType = new GenericType<CustomFields>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Gets a list of permission profiles. Retrieves a list of Permission Profiles. Permission Profiles are a standard set of user permissions that you can apply to individual users or users in a Group. This makes it easier to manage user permissions for a large number of users, without having to change permissions on a user-by-user basis.  Currently, Permission Profiles can only be created and modified in the DocuSign console.
  /// </summary>
  public class ListPermissionsOptions
  {
  private String include = null;
  /*
   * 
   */
  public void setInclude(String include) {
    this.include = include;
  }

  public String getInclude() {
    return this.include;
  }
  }

   /**
   * Gets a list of permission profiles.
   * Retrieves a list of Permission Profiles. Permission Profiles are a standard set of user permissions that you can apply to individual users or users in a Group. This makes it easier to manage user permissions for a large number of users, without having to change permissions on a user-by-user basis.  Currently, Permission Profiles can only be created and modified in the DocuSign console.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return PermissionProfileInformation
   */ 
  public PermissionProfileInformation listPermissions(String accountId) throws ApiException {
    return listPermissions(accountId, null);
  }

  /**
   * Gets a list of permission profiles.
   * Retrieves a list of Permission Profiles. Permission Profiles are a standard set of user permissions that you can apply to individual users or users in a Group. This makes it easier to manage user permissions for a large number of users, without having to change permissions on a user-by-user basis.  Currently, Permission Profiles can only be created and modified in the DocuSign console.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return PermissionProfileInformation
   * @throws ApiException if fails to make API call
   */
  public PermissionProfileInformation listPermissions(String accountId, AccountsApi.ListPermissionsOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listPermissions");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/permission_profiles"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include", options.include));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<PermissionProfileInformation> localVarReturnType = new GenericType<PermissionProfileInformation>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Gets recipient names associated with an email address. Retrieves a list of recipients in the specified account that are associated with a email address supplied in the query string.
  /// </summary>
  public class ListRecipientNamesByEmailOptions
  {
  private String email = null;
  /*
   * The email address for the user 
   */
  public void setEmail(String email) {
    this.email = email;
  }

  public String getEmail() {
    return this.email;
  }
  }

   /**
   * Gets recipient names associated with an email address.
   * Retrieves a list of recipients in the specified account that are associated with a email address supplied in the query string.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return RecipientNamesResponse
   */ 
  public RecipientNamesResponse listRecipientNamesByEmail(String accountId) throws ApiException {
    return listRecipientNamesByEmail(accountId, null);
  }

  /**
   * Gets recipient names associated with an email address.
   * Retrieves a list of recipients in the specified account that are associated with a email address supplied in the query string.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return RecipientNamesResponse
   * @throws ApiException if fails to make API call
   */
  public RecipientNamesResponse listRecipientNamesByEmail(String accountId, AccountsApi.ListRecipientNamesByEmailOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listRecipientNamesByEmail");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/recipient_names"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("email", options.email));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<RecipientNamesResponse> localVarReturnType = new GenericType<RecipientNamesResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Gets account settings information.
   * Retrieves the account settings information for the specified account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return AccountSettingsInformation
   * @throws ApiException if fails to make API call
   */
  public AccountSettingsInformation listSettings(String accountId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listSettings");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/settings"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<AccountSettingsInformation> localVarReturnType = new GenericType<AccountSettingsInformation>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Reserved: Gets the shared item status for one or more users. Reserved: Retrieves shared item status for one or more users and types of items.  Users with account administration privileges can retrieve shared access information for all account users. Users without account administrator privileges can only retrieve shared access information for themselves and the returned information is limited to the retrieving the status of all members of the account that are sharing their folders to the user. This is equivalent to setting the shared&#x3D;shared_from.
  /// </summary>
  public class ListSharedAccessOptions
  {
  private String count = null;
  private String envelopesNotSharedUserStatus = null;
  private String folderIds = null;
  private String itemType = null;
  private String searchText = null;
  private String shared = null;
  private String startPosition = null;
  private String userIds = null;
  /*
   * Specifies maximum number of results included in the response. If no value is specified, this defaults to 1000. 
   */
  public void setCount(String count) {
    this.count = count;
  }

  public String getCount() {
    return this.count;
  }
  /*
   * 
   */
  public void setEnvelopesNotSharedUserStatus(String envelopesNotSharedUserStatus) {
    this.envelopesNotSharedUserStatus = envelopesNotSharedUserStatus;
  }

  public String getEnvelopesNotSharedUserStatus() {
    return this.envelopesNotSharedUserStatus;
  }
  /*
   * 
   */
  public void setFolderIds(String folderIds) {
    this.folderIds = folderIds;
  }

  public String getFolderIds() {
    return this.folderIds;
  }
  /*
   * Specifies the type of shared item being requested. The accepted values are: -envelopes: returns information about envelope sharing between users. 
   */
  public void setItemType(String itemType) {
    this.itemType = itemType;
  }

  public String getItemType() {
    return this.itemType;
  }
  /*
   * This can be used to filter user names in the response. The wild-card &#39;*&#39; (asterisk) can be used around the string. 
   */
  public void setSearchText(String searchText) {
    this.searchText = searchText;
  }

  public String getSearchText() {
    return this.searchText;
  }
  /*
   * Specifies which users should be included in the response. Multiple values can be used in the query by using a comma separated list of shared values. If the requestor does not have account administrator privileges, the shared_to value is used. Requestors that do not have account administrator privileges can only use the shared_to, any other setting will result in an error. The accepted values are:  -not_shared: Returns account users that the specified item type is not being shared with and that are not sharing the specified item type with the user.  User X (Share) X Account user  -shared_to: Returns account users that the specified item type is not being shared with and who are sharing the specified item type with the user (only shared to the user).  User X (Share) Account user  -shared_from: Returns account users that the specified item type is being shared with and who are not sharing the specified item type with the user (only shared from the user).  User (Share) &gt;&gt; Account user  -shared_to_and_from: Returns account users that the specified item type is being shared with and who are sharing the specified item type with the user.  User &lt;&lt; (Share) &gt;&gt; Account user 
   */
  public void setShared(String shared) {
    this.shared = shared;
  }

  public String getShared() {
    return this.shared;
  }
  /*
   * If the response set exceeds Count, this can be used to specify that the method should return users starting at the specified index. The first index is 0, and should be used in the first GET call. Typically this number is a multiple of Count. If no value is specified, this defaults to be 0.  
   */
  public void setStartPosition(String startPosition) {
    this.startPosition = startPosition;
  }

  public String getStartPosition() {
    return this.startPosition;
  }
  /*
   * A comma separated list of userIds for whom the shared item information is being requested.  
   */
  public void setUserIds(String userIds) {
    this.userIds = userIds;
  }

  public String getUserIds() {
    return this.userIds;
  }
  }

   /**
   * Reserved: Gets the shared item status for one or more users.
   * Reserved: Retrieves shared item status for one or more users and types of items.  Users with account administration privileges can retrieve shared access information for all account users. Users without account administrator privileges can only retrieve shared access information for themselves and the returned information is limited to the retrieving the status of all members of the account that are sharing their folders to the user. This is equivalent to setting the shared&#x3D;shared_from.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return AccountSharedAccess
   */ 
  public AccountSharedAccess listSharedAccess(String accountId) throws ApiException {
    return listSharedAccess(accountId, null);
  }

  /**
   * Reserved: Gets the shared item status for one or more users.
   * Reserved: Retrieves shared item status for one or more users and types of items.  Users with account administration privileges can retrieve shared access information for all account users. Users without account administrator privileges can only retrieve shared access information for themselves and the returned information is limited to the retrieving the status of all members of the account that are sharing their folders to the user. This is equivalent to setting the shared&#x3D;shared_from.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return AccountSharedAccess
   * @throws ApiException if fails to make API call
   */
  public AccountSharedAccess listSharedAccess(String accountId, AccountsApi.ListSharedAccessOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listSharedAccess");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/shared_access"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("count", options.count));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("envelopes_not_shared_user_status", options.envelopesNotSharedUserStatus));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("folder_ids", options.folderIds));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("item_type", options.itemType));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("search_text", options.searchText));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("shared", options.shared));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("start_position", options.startPosition));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("user_ids", options.userIds));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<AccountSharedAccess> localVarReturnType = new GenericType<AccountSharedAccess>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Returns Account available signature providers for specified account.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return AccountSignatureProviders
   * @throws ApiException if fails to make API call
   */
  public AccountSignatureProviders listSignatureProviders(String accountId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listSignatureProviders");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/signatureProviders"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<AccountSignatureProviders> localVarReturnType = new GenericType<AccountSignatureProviders>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Gets a list of unsupported file types.
   * Retrieves a list of file types (mime-types and file-extensions) that are not supported for upload through the DocuSign system.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return FileTypeList
   * @throws ApiException if fails to make API call
   */
  public FileTypeList listUnsupportedFileTypes(String accountId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listUnsupportedFileTypes");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/unsupported_file_types"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<FileTypeList> localVarReturnType = new GenericType<FileTypeList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Unfavorite a template
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param favoriteTemplatesInfo  (optional)
   * @return FavoriteTemplatesInfo
   * @throws ApiException if fails to make API call
   */
  public FavoriteTemplatesInfo unFavoriteTemplate(String accountId, FavoriteTemplatesInfo favoriteTemplatesInfo) throws ApiException {
    Object localVarPostBody = favoriteTemplatesInfo;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling unFavoriteTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/favorite_templates"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<FavoriteTemplatesInfo> localVarReturnType = new GenericType<FavoriteTemplatesInfo>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Updates a account signature.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param accountSignaturesInformation  (optional)
   * @return AccountSignaturesInformation
   * @throws ApiException if fails to make API call
   */
  public AccountSignaturesInformation updateAccountSignature(String accountId, AccountSignaturesInformation accountSignaturesInformation) throws ApiException {
    Object localVarPostBody = accountSignaturesInformation;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateAccountSignature");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/signatures"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<AccountSignaturesInformation> localVarReturnType = new GenericType<AccountSignaturesInformation>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Updates a account signature. 
  /// </summary>
  public class UpdateAccountSignatureByIdOptions
  {
  private String closeExistingSignature = null;
  /*
   * 
   */
  public void setCloseExistingSignature(String closeExistingSignature) {
    this.closeExistingSignature = closeExistingSignature;
  }

  public String getCloseExistingSignature() {
    return this.closeExistingSignature;
  }
  }

   /**
   * Updates a account signature.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @param accountSignatureDefinition  (optional)
   * @return AccountSignature
   */ 
  public AccountSignature updateAccountSignatureById(String accountId, String signatureId, AccountSignatureDefinition accountSignatureDefinition) throws ApiException {
    return updateAccountSignatureById(accountId, signatureId, accountSignatureDefinition, null);
  }

  /**
   * Updates a account signature.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @param accountSignatureDefinition  (optional)
   * @param options for modifying the method behavior.
   * @return AccountSignature
   * @throws ApiException if fails to make API call
   */
  public AccountSignature updateAccountSignatureById(String accountId, String signatureId, AccountSignatureDefinition accountSignatureDefinition, AccountsApi.UpdateAccountSignatureByIdOptions options) throws ApiException {
    Object localVarPostBody = accountSignatureDefinition;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateAccountSignatureById");
    }
    
    // verify the required parameter 'signatureId' is set
    if (signatureId == null) {
      throw new ApiException(400, "Missing the required parameter 'signatureId' when calling updateAccountSignatureById");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/signatures/{signatureId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "signatureId" + "\\}", apiClient.escapeString(signatureId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("close_existing_signature", options.closeExistingSignature));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<AccountSignature> localVarReturnType = new GenericType<AccountSignature>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Sets a signature, initials, or stamps image. 
  /// </summary>
  public class UpdateAccountSignatureImageOptions
  {
  private String transparentPng = null;
  /*
   * 
   */
  public void setTransparentPng(String transparentPng) {
    this.transparentPng = transparentPng;
  }

  public String getTransparentPng() {
    return this.transparentPng;
  }
  }

   /**
   * Sets a signature, initials, or stamps image.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @param imageType One of **signature_image** or **initials_image**. (required)
   * @return AccountSignature
   */ 
  public AccountSignature updateAccountSignatureImage(String accountId, String signatureId, String imageType) throws ApiException {
    return updateAccountSignatureImage(accountId, signatureId, imageType, null);
  }

  /**
   * Sets a signature, initials, or stamps image.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param signatureId The ID of the signature being accessed. (required)
   * @param imageType One of **signature_image** or **initials_image**. (required)
   * @param options for modifying the method behavior.
   * @return AccountSignature
   * @throws ApiException if fails to make API call
   */
  public AccountSignature updateAccountSignatureImage(String accountId, String signatureId, String imageType, AccountsApi.UpdateAccountSignatureImageOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateAccountSignatureImage");
    }
    
    // verify the required parameter 'signatureId' is set
    if (signatureId == null) {
      throw new ApiException(400, "Missing the required parameter 'signatureId' when calling updateAccountSignatureImage");
    }
    
    // verify the required parameter 'imageType' is set
    if (imageType == null) {
      throw new ApiException(400, "Missing the required parameter 'imageType' when calling updateAccountSignatureImage");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/signatures/{signatureId}/{imageType}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "signatureId" + "\\}", apiClient.escapeString(signatureId.toString()))
      .replaceAll("\\{" + "imageType" + "\\}", apiClient.escapeString(imageType.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("transparent_png", options.transparentPng));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "image/gif"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<AccountSignature> localVarReturnType = new GenericType<AccountSignature>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Modifies tab settings for specified account
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param tabAccountSettings  (optional)
   * @return TabAccountSettings
   * @throws ApiException if fails to make API call
   */
  public TabAccountSettings updateAccountTabSettings(String accountId, TabAccountSettings tabAccountSettings) throws ApiException {
    Object localVarPostBody = tabAccountSettings;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateAccountTabSettings");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/settings/tabs"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<TabAccountSettings> localVarReturnType = new GenericType<TabAccountSettings>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Updates an existing brand.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param brandId The unique identifier of a brand. (required)
   * @param brand  (optional)
   * @return Brand
   * @throws ApiException if fails to make API call
   */
  public Brand updateBrand(String accountId, String brandId, Brand brand) throws ApiException {
    Object localVarPostBody = brand;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateBrand");
    }
    
    // verify the required parameter 'brandId' is set
    if (brandId == null) {
      throw new ApiException(400, "Missing the required parameter 'brandId' when calling updateBrand");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/brands/{brandId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "brandId" + "\\}", apiClient.escapeString(brandId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<Brand> localVarReturnType = new GenericType<Brand>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Put one branding logo.
   * 
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param brandId The id of the brand. (required)
   * @param logoType The type of logo. Valid values are:  - &#x60;primary&#x60;  - &#x60;secondary&#x60;  - &#x60;email&#x60; (required)
   * @param logoFileBytes Brand logo binary Stream. Supported formats: JPG, GIF, PNG. Maximum file size: 300 KB. Recommended dimensions: 296 x 76 pixels (larger images will be resized). Changes may take up to one hour to display in all places (required)
   * @throws ApiException if fails to make API call
   */
  public void updateBrandLogoByType(String accountId, String brandId, String logoType, byte[] logoFileBytes) throws ApiException {
    Object localVarPostBody = logoFileBytes;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateBrandLogoByType");
    }
    
    // verify the required parameter 'brandId' is set
    if (brandId == null) {
      throw new ApiException(400, "Missing the required parameter 'brandId' when calling updateBrandLogoByType");
    }
    
    // verify the required parameter 'logoType' is set
    if (logoType == null) {
      throw new ApiException(400, "Missing the required parameter 'logoType' when calling updateBrandLogoByType");
    }
    
    // verify the required parameter 'logoFileBytes' is set
    if (logoFileBytes == null) {
      throw new ApiException(400, "Missing the required parameter 'logoFileBytes' when calling updateBrandLogoByType");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/brands/{brandId}/logos/{logoType}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "brandId" + "\\}", apiClient.escapeString(brandId.toString()))
      .replaceAll("\\{" + "logoType" + "\\}", apiClient.escapeString(logoType.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "image/png"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }

  /**
   * Uploads a branding resource file.
   * 
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param brandId The id of the brand. (required)
   * @param resourceContentType The type of brand resource file that you are updating. Valid values are:  - &#x60;sending&#x60; - &#x60;signing&#x60; - &#x60;email&#x60; - &#x60;signing_captive&#x60; (required)
   * @param fileXml Brand resource XML file. (required)
   * @return BrandResources
   * @throws ApiException if fails to make API call
   */
  public BrandResources updateBrandResourcesByContentType(String accountId, String brandId, String resourceContentType, byte[] fileXml) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateBrandResourcesByContentType");
    }
    
    // verify the required parameter 'brandId' is set
    if (brandId == null) {
      throw new ApiException(400, "Missing the required parameter 'brandId' when calling updateBrandResourcesByContentType");
    }
    
    // verify the required parameter 'resourceContentType' is set
    if (resourceContentType == null) {
      throw new ApiException(400, "Missing the required parameter 'resourceContentType' when calling updateBrandResourcesByContentType");
    }
    
    // verify the required parameter 'fileXml' is set
    if (fileXml == null) {
      throw new ApiException(400, "Missing the required parameter 'fileXml' when calling updateBrandResourcesByContentType");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/brands/{brandId}/resources/{resourceContentType}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "brandId" + "\\}", apiClient.escapeString(brandId.toString()))
      .replaceAll("\\{" + "resourceContentType" + "\\}", apiClient.escapeString(resourceContentType.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    if (fileXml != null) {
      localVarFormParams.put("file.xml", fileXml);
    }

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<BrandResources> localVarReturnType = new GenericType<BrandResources>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Update Consumer Disclosure. 
  /// </summary>
  public class UpdateConsumerDisclosureOptions
  {
  private String includeMetadata = null;
  /*
   * 
   */
  public void setIncludeMetadata(String includeMetadata) {
    this.includeMetadata = includeMetadata;
  }

  public String getIncludeMetadata() {
    return this.includeMetadata;
  }
  }

   /**
   * Update Consumer Disclosure.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param langCode The simple type enumeration the language used in the response. The supported languages, with the language value shown in parenthesis, are:Arabic (ar), Armenian (hy), Bulgarian (bg), Czech (cs), Chinese Simplified (zh_CN), Chinese Traditional (zh_TW), Croatian (hr), Danish (da), Dutch (nl), English US (en), English UK (en_GB), Estonian (et), Farsi (fa), Finnish (fi), French (fr), French Canada (fr_CA), German (de), Greek (el), Hebrew (he), Hindi (hi), Hungarian (hu), Bahasa Indonesia (id), Italian (it), Japanese (ja), Korean (ko), Latvian (lv), Lithuanian (lt), Bahasa Melayu (ms), Norwegian (no), Polish (pl), Portuguese (pt), Portuguese Brazil (pt_BR), Romanian (ro), Russian (ru), Serbian (sr), Slovak (sk), Slovenian (sl), Spanish (es),Spanish Latin America (es_MX), Swedish (sv), Thai (th), Turkish (tr), Ukrainian (uk) and Vietnamese (vi). Additionally, the value can be set to Ã¯Â¿Â½browserÃ¯Â¿Â½ to automatically detect the browser language being used by the viewer and display the disclosure in that language. (required)
   * @param consumerDisclosure  (optional)
   * @return ConsumerDisclosure
   */ 
  public ConsumerDisclosure updateConsumerDisclosure(String accountId, String langCode, ConsumerDisclosure consumerDisclosure) throws ApiException {
    return updateConsumerDisclosure(accountId, langCode, consumerDisclosure, null);
  }

  /**
   * Update Consumer Disclosure.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param langCode The simple type enumeration the language used in the response. The supported languages, with the language value shown in parenthesis, are:Arabic (ar), Armenian (hy), Bulgarian (bg), Czech (cs), Chinese Simplified (zh_CN), Chinese Traditional (zh_TW), Croatian (hr), Danish (da), Dutch (nl), English US (en), English UK (en_GB), Estonian (et), Farsi (fa), Finnish (fi), French (fr), French Canada (fr_CA), German (de), Greek (el), Hebrew (he), Hindi (hi), Hungarian (hu), Bahasa Indonesia (id), Italian (it), Japanese (ja), Korean (ko), Latvian (lv), Lithuanian (lt), Bahasa Melayu (ms), Norwegian (no), Polish (pl), Portuguese (pt), Portuguese Brazil (pt_BR), Romanian (ro), Russian (ru), Serbian (sr), Slovak (sk), Slovenian (sl), Spanish (es),Spanish Latin America (es_MX), Swedish (sv), Thai (th), Turkish (tr), Ukrainian (uk) and Vietnamese (vi). Additionally, the value can be set to Ã¯Â¿Â½browserÃ¯Â¿Â½ to automatically detect the browser language being used by the viewer and display the disclosure in that language. (required)
   * @param consumerDisclosure  (optional)
   * @param options for modifying the method behavior.
   * @return ConsumerDisclosure
   * @throws ApiException if fails to make API call
   */
  public ConsumerDisclosure updateConsumerDisclosure(String accountId, String langCode, ConsumerDisclosure consumerDisclosure, AccountsApi.UpdateConsumerDisclosureOptions options) throws ApiException {
    Object localVarPostBody = consumerDisclosure;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateConsumerDisclosure");
    }
    
    // verify the required parameter 'langCode' is set
    if (langCode == null) {
      throw new ApiException(400, "Missing the required parameter 'langCode' when calling updateConsumerDisclosure");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/consumer_disclosure/{langCode}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "langCode" + "\\}", apiClient.escapeString(langCode.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_metadata", options.includeMetadata));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<ConsumerDisclosure> localVarReturnType = new GenericType<ConsumerDisclosure>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Updates an existing account custom field. 
  /// </summary>
  public class UpdateCustomFieldOptions
  {
  private String applyToTemplates = null;
  /*
   * 
   */
  public void setApplyToTemplates(String applyToTemplates) {
    this.applyToTemplates = applyToTemplates;
  }

  public String getApplyToTemplates() {
    return this.applyToTemplates;
  }
  }

   /**
   * Updates an existing account custom field.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param customFieldId  (required)
   * @param customField  (optional)
   * @return CustomFields
   */ 
  public CustomFields updateCustomField(String accountId, String customFieldId, CustomField customField) throws ApiException {
    return updateCustomField(accountId, customFieldId, customField, null);
  }

  /**
   * Updates an existing account custom field.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param customFieldId  (required)
   * @param customField  (optional)
   * @param options for modifying the method behavior.
   * @return CustomFields
   * @throws ApiException if fails to make API call
   */
  public CustomFields updateCustomField(String accountId, String customFieldId, CustomField customField, AccountsApi.UpdateCustomFieldOptions options) throws ApiException {
    Object localVarPostBody = customField;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateCustomField");
    }
    
    // verify the required parameter 'customFieldId' is set
    if (customFieldId == null) {
      throw new ApiException(400, "Missing the required parameter 'customFieldId' when calling updateCustomField");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/custom_fields/{customFieldId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "customFieldId" + "\\}", apiClient.escapeString(customFieldId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("apply_to_templates", options.applyToTemplates));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<CustomFields> localVarReturnType = new GenericType<CustomFields>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Updates configuration information for the eNote eOriginal integration.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param eNoteConfiguration  (optional)
   * @return ENoteConfiguration
   * @throws ApiException if fails to make API call
   */
  public ENoteConfiguration updateENoteConfiguration(String accountId, ENoteConfiguration eNoteConfiguration) throws ApiException {
    Object localVarPostBody = eNoteConfiguration;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateENoteConfiguration");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/settings/enote_configuration"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<ENoteConfiguration> localVarReturnType = new GenericType<ENoteConfiguration>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Updates envelope purge configuration.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopePurgeConfiguration  (optional)
   * @return EnvelopePurgeConfiguration
   * @throws ApiException if fails to make API call
   */
  public EnvelopePurgeConfiguration updateEnvelopePurgeConfiguration(String accountId, EnvelopePurgeConfiguration envelopePurgeConfiguration) throws ApiException {
    Object localVarPostBody = envelopePurgeConfiguration;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateEnvelopePurgeConfiguration");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/settings/envelope_purge_configuration"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<EnvelopePurgeConfiguration> localVarReturnType = new GenericType<EnvelopePurgeConfiguration>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Favorites a template
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param favoriteTemplatesInfo  (optional)
   * @return FavoriteTemplatesInfo
   * @throws ApiException if fails to make API call
   */
  public FavoriteTemplatesInfo updateFavoriteTemplate(String accountId, FavoriteTemplatesInfo favoriteTemplatesInfo) throws ApiException {
    Object localVarPostBody = favoriteTemplatesInfo;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateFavoriteTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/favorite_templates"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<FavoriteTemplatesInfo> localVarReturnType = new GenericType<FavoriteTemplatesInfo>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Updates default user level settings for a specified account
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param notificationDefaults  (optional)
   * @return NotificationDefaults
   * @throws ApiException if fails to make API call
   */
  public NotificationDefaults updateNotificationDefaults(String accountId, NotificationDefaults notificationDefaults) throws ApiException {
    Object localVarPostBody = notificationDefaults;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateNotificationDefaults");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/settings/notification_defaults"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<NotificationDefaults> localVarReturnType = new GenericType<NotificationDefaults>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Update the password rules
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param accountPasswordRules  (optional)
   * @return AccountPasswordRules
   * @throws ApiException if fails to make API call
   */
  public AccountPasswordRules updatePasswordRules(String accountId, AccountPasswordRules accountPasswordRules) throws ApiException {
    Object localVarPostBody = accountPasswordRules;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updatePasswordRules");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/settings/password_rules"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<AccountPasswordRules> localVarReturnType = new GenericType<AccountPasswordRules>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Updates a permission profile within the specified account. 
  /// </summary>
  public class UpdatePermissionProfileOptions
  {
  private String include = null;
  /*
   * 
   */
  public void setInclude(String include) {
    this.include = include;
  }

  public String getInclude() {
    return this.include;
  }
  }

   /**
   * Updates a permission profile within the specified account.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param permissionProfileId  (required)
   * @param permissionProfile  (optional)
   * @return PermissionProfile
   */ 
  public PermissionProfile updatePermissionProfile(String accountId, String permissionProfileId, PermissionProfile permissionProfile) throws ApiException {
    return updatePermissionProfile(accountId, permissionProfileId, permissionProfile, null);
  }

  /**
   * Updates a permission profile within the specified account.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param permissionProfileId  (required)
   * @param permissionProfile  (optional)
   * @param options for modifying the method behavior.
   * @return PermissionProfile
   * @throws ApiException if fails to make API call
   */
  public PermissionProfile updatePermissionProfile(String accountId, String permissionProfileId, PermissionProfile permissionProfile, AccountsApi.UpdatePermissionProfileOptions options) throws ApiException {
    Object localVarPostBody = permissionProfile;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updatePermissionProfile");
    }
    
    // verify the required parameter 'permissionProfileId' is set
    if (permissionProfileId == null) {
      throw new ApiException(400, "Missing the required parameter 'permissionProfileId' when calling updatePermissionProfile");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/permission_profiles/{permissionProfileId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "permissionProfileId" + "\\}", apiClient.escapeString(permissionProfileId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include", options.include));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<PermissionProfile> localVarReturnType = new GenericType<PermissionProfile>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Returns the result set from running the specified report
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param reportInProductRunRequest  (optional)
   * @return ReportInProductRunResponse
   * @throws ApiException if fails to make API call
   */
  public ReportInProductRunResponse updateReportInProductRunResults(String accountId, ReportInProductRunRequest reportInProductRunRequest) throws ApiException {
    Object localVarPostBody = reportInProductRunRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateReportInProductRunResults");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/reports/report_results"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<ReportInProductRunResponse> localVarReturnType = new GenericType<ReportInProductRunResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Saves a customized report
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param id  (required)
   * @param reportInProductRunRequest  (optional)
   * @return ReportInProductSaveResponse
   * @throws ApiException if fails to make API call
   */
  public ReportInProductSaveResponse updateReportInProductSave(String accountId, String id, ReportInProductRunRequest reportInProductRunRequest) throws ApiException {
    Object localVarPostBody = reportInProductRunRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateReportInProductSave");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateReportInProductSave");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/reports/{id}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<ReportInProductSaveResponse> localVarReturnType = new GenericType<ReportInProductSaveResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }



  public void updateReportResultsCsv(String accountId, ReportInProductCsvRunRequest reportInProductCsvRunRequest) throws ApiException {
    Object localVarPostBody = reportInProductCsvRunRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateReportResultsCsv");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/reports/report_results_csv"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }



  public void updateSettings(String accountId, AccountSettingsInformation accountSettingsInformation) throws ApiException {
    Object localVarPostBody = accountSettingsInformation;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateSettings");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/settings"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
 
  
  public class UpdateSharedAccessOptions
  {
  private String itemType = null;
  private String preserveExistingSharedAccess = null;
  private String userIds = null;
  /*
   * 
   */
  public void setItemType(String itemType) {
    this.itemType = itemType;
  }

  public String getItemType() {
    return this.itemType;
  }
  /*
   * 
   */
  public void setPreserveExistingSharedAccess(String preserveExistingSharedAccess) {
    this.preserveExistingSharedAccess = preserveExistingSharedAccess;
  }

  public String getPreserveExistingSharedAccess() {
    return this.preserveExistingSharedAccess;
  }
  /*
   * 
   */
  public void setUserIds(String userIds) {
    this.userIds = userIds;
  }

  public String getUserIds() {
    return this.userIds;
  }
  }

   /**
   * Reserved: Sets the shared access information for users.
   * Reserved: Sets the shared access information for one or more users.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param accountSharedAccess  (optional)
   * @return AccountSharedAccess
   */ 
  public AccountSharedAccess updateSharedAccess(String accountId, AccountSharedAccess accountSharedAccess) throws ApiException {
    return updateSharedAccess(accountId, accountSharedAccess, null);
  }

  /**
   * Reserved: Sets the shared access information for users.
   * Reserved: Sets the shared access information for one or more users.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param accountSharedAccess  (optional)
   * @param options for modifying the method behavior.
   * @return AccountSharedAccess
   * @throws ApiException if fails to make API call
   */
  public AccountSharedAccess updateSharedAccess(String accountId, AccountSharedAccess accountSharedAccess, AccountsApi.UpdateSharedAccessOptions options) throws ApiException {
    Object localVarPostBody = accountSharedAccess;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateSharedAccess");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/shared_access"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("item_type", options.itemType));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("preserve_existing_shared_access", options.preserveExistingSharedAccess));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("user_ids", options.userIds));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<AccountSharedAccess> localVarReturnType = new GenericType<AccountSharedAccess>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Update watermark information.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param watermark  (optional)
   * @return Watermark
   * @throws ApiException if fails to make API call
   */
  public Watermark updateWatermark(String accountId, Watermark watermark) throws ApiException {
    Object localVarPostBody = watermark;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateWatermark");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/watermark"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<Watermark> localVarReturnType = new GenericType<Watermark>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
