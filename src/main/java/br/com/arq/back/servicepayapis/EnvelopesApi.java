
package br.com.arq.back.servicepayapis;

import javax.ws.rs.core.GenericType;

import com.docusign.esign.client.ApiException;
import com.docusign.esign.client.ApiClient;
import com.docusign.esign.client.Configuration;
import com.docusign.esign.model.*;
import com.docusign.esign.client.Pair;



public class EnvelopesApi {
  private ApiClient apiClient;

  public EnvelopesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EnvelopesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /// <summary>
  /// Adds templates to an envelope. Adds templates to the specified envelope.
  /// </summary>
  public class ApplyTemplateOptions
  {
  private String preserveTemplateRecipient = null;
  /*
   * 
   */
  public void setPreserveTemplateRecipient(String preserveTemplateRecipient) {
    this.preserveTemplateRecipient = preserveTemplateRecipient;
  }

  public String getPreserveTemplateRecipient() {
    return this.preserveTemplateRecipient;
  }
  }

   /**
   * Adds templates to an envelope.
   * Adds templates to the specified envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentTemplateList  (optional)
   * @return DocumentTemplateList
   */ 
  public DocumentTemplateList applyTemplate(String accountId, String envelopeId, DocumentTemplateList documentTemplateList) throws ApiException {
    return applyTemplate(accountId, envelopeId, documentTemplateList, null);
  }

  /**
   * Adds templates to an envelope.
   * Adds templates to the specified envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentTemplateList  (optional)
   * @param options for modifying the method behavior.
   * @return DocumentTemplateList
   * @throws ApiException if fails to make API call
   */
  public DocumentTemplateList applyTemplate(String accountId, String envelopeId, DocumentTemplateList documentTemplateList, EnvelopesApi.ApplyTemplateOptions options) throws ApiException {
    Object localVarPostBody = documentTemplateList;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling applyTemplate");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling applyTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/templates"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("preserve_template_recipient", options.preserveTemplateRecipient));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<DocumentTemplateList> localVarReturnType = new GenericType<DocumentTemplateList>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Adds templates to a document in an  envelope. Adds templates to a document in the specified envelope.
  /// </summary>
  public class ApplyTemplateToDocumentOptions
  {
  private String preserveTemplateRecipient = null;
  /*
   * 
   */
  public void setPreserveTemplateRecipient(String preserveTemplateRecipient) {
    this.preserveTemplateRecipient = preserveTemplateRecipient;
  }

  public String getPreserveTemplateRecipient() {
    return this.preserveTemplateRecipient;
  }
  }

   /**
   * Adds templates to a document in an  envelope.
   * Adds templates to a document in the specified envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param documentTemplateList  (optional)
   * @return DocumentTemplateList
   */ 
  public DocumentTemplateList applyTemplateToDocument(String accountId, String envelopeId, String documentId, DocumentTemplateList documentTemplateList) throws ApiException {
    return applyTemplateToDocument(accountId, envelopeId, documentId, documentTemplateList, null);
  }

  /**
   * Adds templates to a document in an  envelope.
   * Adds templates to a document in the specified envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param documentTemplateList  (optional)
   * @param options for modifying the method behavior.
   * @return DocumentTemplateList
   * @throws ApiException if fails to make API call
   */
  public DocumentTemplateList applyTemplateToDocument(String accountId, String envelopeId, String documentId, DocumentTemplateList documentTemplateList, EnvelopesApi.ApplyTemplateToDocumentOptions options) throws ApiException {
    Object localVarPostBody = documentTemplateList;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling applyTemplateToDocument");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling applyTemplateToDocument");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling applyTemplateToDocument");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/templates"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("preserve_template_recipient", options.preserveTemplateRecipient));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<DocumentTemplateList> localVarReturnType = new GenericType<DocumentTemplateList>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Initiate a new ChunkedUpload.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param chunkedUploadRequest  (optional)
   * @return ChunkedUploadResponse
   * @throws ApiException if fails to make API call
   */
  public ChunkedUploadResponse createChunkedUpload(String accountId, ChunkedUploadRequest chunkedUploadRequest) throws ApiException {
    Object localVarPostBody = chunkedUploadRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createChunkedUpload");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/chunked_uploads"
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

    GenericType<ChunkedUploadResponse> localVarReturnType = new GenericType<ChunkedUploadResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Returns a URL to the authentication view UI.
   * Returns a URL that allows you to embed the authentication view of the DocuSign UI in your applications.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param consoleViewRequest  (optional)
   * @return ViewUrl
   * @throws ApiException if fails to make API call
   */
  public ViewUrl createConsoleView(String accountId, ConsoleViewRequest consoleViewRequest) throws ApiException {
    Object localVarPostBody = consoleViewRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createConsoleView");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/views/console"
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

    GenericType<ViewUrl> localVarReturnType = new GenericType<ViewUrl>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Returns a URL to the envelope correction UI.
   * Returns a URL that allows you to embed the envelope correction view of the DocuSign UI in your applications.  Important: iFrames should not be used for embedded operations on mobile devices due to screen space issues. For iOS devices DocuSign recommends using a WebView. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param correctViewRequest  (optional)
   * @return ViewUrl
   * @throws ApiException if fails to make API call
   */
  public ViewUrl createCorrectView(String accountId, String envelopeId, CorrectViewRequest correctViewRequest) throws ApiException {
    Object localVarPostBody = correctViewRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createCorrectView");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createCorrectView");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/views/correct"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    GenericType<ViewUrl> localVarReturnType = new GenericType<ViewUrl>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Updates envelope custom fields for an envelope.
   * Updates the envelope custom fields for draft and in-process envelopes.  Each custom field used in an envelope must have a unique name.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param customFields  (optional)
   * @return CustomFields
   * @throws ApiException if fails to make API call
   */
  public CustomFields createCustomFields(String accountId, String envelopeId, CustomFields customFields) throws ApiException {
    Object localVarPostBody = customFields;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createCustomFields");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/custom_fields"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Creates custom document fields in an existing envelope document.
   * Creates custom document fields in an existing envelope document.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param documentFieldsInformation  (optional)
   * @return DocumentFieldsInformation
   * @throws ApiException if fails to make API call
   */
  public DocumentFieldsInformation createDocumentFields(String accountId, String envelopeId, String documentId, DocumentFieldsInformation documentFieldsInformation) throws ApiException {
    Object localVarPostBody = documentFieldsInformation;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createDocumentFields");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createDocumentFields");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling createDocumentFields");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/fields"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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

    GenericType<DocumentFieldsInformation> localVarReturnType = new GenericType<DocumentFieldsInformation>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Get Responsive HTML Preview for a document in an envelope.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param documentHtmlDefinition  (optional)
   * @return DocumentHtmlDefinitions
   * @throws ApiException if fails to make API call
   */
  public DocumentHtmlDefinitions createDocumentResponsiveHtmlPreview(String accountId, String envelopeId, String documentId, DocumentHtmlDefinition documentHtmlDefinition) throws ApiException {
    Object localVarPostBody = documentHtmlDefinition;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createDocumentResponsiveHtmlPreview");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createDocumentResponsiveHtmlPreview");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling createDocumentResponsiveHtmlPreview");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/responsive_html_preview"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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

    GenericType<DocumentHtmlDefinitions> localVarReturnType = new GenericType<DocumentHtmlDefinitions>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Adds the tabs to an envelope document
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param tabs  (optional)
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public Tabs createDocumentTabs(String accountId, String envelopeId, String documentId, Tabs tabs) throws ApiException {
    Object localVarPostBody = tabs;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createDocumentTabs");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createDocumentTabs");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling createDocumentTabs");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/tabs"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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

    GenericType<Tabs> localVarReturnType = new GenericType<Tabs>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Returns a URL to the edit view UI.
   * Returns a URL that allows you to embed the edit view of the DocuSign UI in your applications. This is a one-time use login token that allows the user to be placed into the DocuSign editing view.   Upon sending completion, the user is returned to the return URL provided by the API application.  Important: iFrames should not be used for embedded operations on mobile devices due to screen space issues. For iOS devices DocuSign recommends using a WebView. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param returnUrlRequest  (optional)
   * @return ViewUrl
   * @throws ApiException if fails to make API call
   */
  public ViewUrl createEditView(String accountId, String envelopeId, ReturnUrlRequest returnUrlRequest) throws ApiException {
    Object localVarPostBody = returnUrlRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createEditView");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createEditView");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/views/edit"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    GenericType<ViewUrl> localVarReturnType = new GenericType<ViewUrl>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Adds email setting overrides to an envelope.
   * Adds email override settings, changing the email address to reply to an email address, name, or the BCC for email archive information, for the envelope. Note that adding email settings will only affect email communications that occur after the addition was made.  ### Important: The BCC Email address feature is designed to provide a copy of all email communications for external archiving purposes. DocuSign recommends that envelopes sent using the BCC for Email Archive feature, including the BCC Email Override option, include additional signer authentication options. To send a copy of the envelope to a recipient who does not need to sign, use a Carbon Copies or Certified Deliveries Recipient Type.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param emailSettings  (optional)
   * @return EmailSettings
   * @throws ApiException if fails to make API call
   */
  public EmailSettings createEmailSettings(String accountId, String envelopeId, EmailSettings emailSettings) throws ApiException {
    Object localVarPostBody = emailSettings;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createEmailSettings");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createEmailSettings");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/email_settings"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    GenericType<EmailSettings> localVarReturnType = new GenericType<EmailSettings>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Creates an envelope. Creates an envelope.   Using this function you can: * Create an envelope and send it. * Create an envelope from an existing template and send it.  In either case, you can choose to save the envelope as a draft envelope instead of sending it by setting the request&#39;s &#x60;status&#x60; property to &#x60;created&#x60; instead of &#x60;sent&#x60;.  ## Sending Envelopes  Documents can be included with the Envelopes::create call itself or a template can include documents. Documents can be added by using a multi-part/form request or by using the &#x60;documentBase64&#x60; field of the [&#x60;document&#x60; object](#/definitions/document)  ### Recipient Types An [&#x60;envelopeDefinition&#x60; object](#/definitions/envelopeDefinition) is used as the method&#39;s body. Envelope recipients can be defined in the envelope or in templates. The &#x60;envelopeDefinition&#x60; object&#39;s &#x60;recipients&#x60; field is an [&#x60;EnvelopeRecipients&#x60; resource object](#/definitions/EnvelopeRecipients). It includes arrays of the seven types of recipients defined by DocuSign:  Recipient type | Object definition -------------- | ----------------- agent (can add name and email information for later recipients/signers) | [&#x60;agent&#x60;](#/definitions/agent) carbon copy (receives a copy of the documents) | [&#x60;carbonCopy&#x60;](#/definitions/carbonCopy) certified delivery  (receives a copy of the documents and must acknowledge receipt) | [&#x60;certifiedDelivery&#x60;](#/definitions/certifiedDelivery) editor (can change recipients and document fields for later recipients/signers) | [&#x60;editor&#x60;](#/definitions/editor) in-person signer (\&quot;hosts\&quot; someone who signs in-person) | [&#x60;inPersonSigner&#x60;](#/definitions/inPersonSigner) intermediary (can add name and email information for some later recipients/signers.) | [&#x60;intermediary&#x60;](#/definitions/intermediary) signer (signs and/or updates document fields) | [&#x60;signer&#x60;](#/definitions/signer)  Additional information about the different types of recipients is available from the [&#x60;EnvelopeRecipients&#x60; resource page](../../EnvelopeRecipients) and from the [Developer Center](https://www.docusign.com/developer-center/explore/features/recipients)  ### Tabs Tabs (also referred to as &#x60;tags&#x60; and as &#x60;fields&#x60; in the web sending user interface), can be defined in the &#x60;envelopeDefinition&#x60;, in templates, by transforming PDF Form Fields, or by using Composite Templates (see below).  Defining tabs: the &#x60;inPersonSigner&#x60;, and &#x60;signer&#x60; recipient objects include a &#x60;tabs&#x60; field. It is an [&#x60;EnvelopeTabs&#x60; resource object](#/definitions/EnvelopeTabs). It includes arrays of the 24 different tab types available. See the [&#x60;EnvelopeTabs&#x60; resource](../../EnvelopeTabs) for more information.  ## Using Templates Envelopes use specific people or groups as recipients. Templates can specify a role, eg &#x60;account_manager.&#x60; When a template is used in an envelope, the roles must be replaced with specific people or groups.  When you create an envelope using a &#x60;templateId&#x60;, the different recipient type objects within the [&#x60;EnvelopeRecipients&#x60; object](#/definitions/EnvelopeRecipients) are used to assign recipients to the template&#39;s roles via the &#x60;roleName&#x60; property. The recipient objects can also override settings that were specified in the template, and set values for tab fields that were defined in the template.  ### Message Lock When a template is added or applied to an envelope and the template has a locked email subject and message, that subject and message are used for the envelope and cannot be changed even if another locked template is subsequently added or applied to the envelope. The field &#x60;messageLock&#x60; is used to lock the email subject and message.  If an email subject or message is entered before adding or applying a template with &#x60;messageLock&#x60; **true**, the email subject and message is overwritten with the locked email subject and message from the template.  ## Envelope Status The status of sent envelopes can be determined through the DocuSign webhook system or by polling. Webhooks are highly recommended: they provide your application with the quickest updates when an envelope&#39;s status changes. DocuSign limits polling to once every 15 minutes or less frequently.  When a webhook is used, DocuSign calls your application, via the URL you provide, with a notification XML message.   See the [Webhook recipe](https://www.docusign.com/developer-center/recipes/webhook-status) for examples and live demos of using webhooks.  ## Webhook Options The two webhook options, *eventNotification* and *Connect* use the same notification mechanism and message formats. eventNotification is used to create a webhook for a specific envelope sent via the API. Connect webhooks can be used for any envelope sent from an account, from any user, from any client.   ### eventNotification Webhooks The Envelopes::create method includes an optional [eventNotification object](#definition-eventNotification) that adds a webhook to the envelope. eventNotification webhooks are available for all DocuSign accounts with API access.  ### Connect Webhooks Connect can be used to create a webhook for all envelopes sent by all users in an account, either through the API or via other DocuSign clients (web, mobile, etc). Connect configurations are independent of specific envelopes. A Connect configuration includes a filter that may be used to limit the webhook to specific users, envelope statuses, etc.   Connect configurations may be created and managed using the [ConnectConfigurations resource](../../Connect/ConnectConfigurations). Configurations can also be created and managed from the Administration tool accessed by selecting \&quot;Go to Admin\&quot; from the menu next to your picture on the DocuSign web app. See the Integrations/Connect section of the Admin tool. For repeatability, and to minimize support questions, creating Connect configurations via the API is recommended, especially for ISVs.  Connect is available for some DocuSign account types. Please contact DocuSign Sales for more information.  ## Composite Templates  The Composite Templates feature, like [compositing in film production](https://en.wikipedia.org/wiki/Compositing), enables you to *overlay* document, recipient, and tab definitions from multiple sources, including PDF Form Field definitions, templates defined on the server, and more.  Each Composite Template consists of optional elements: server templates, inline templates, PDF Metadata templates, and documents.  * The Composite Template ID is an optional element used to identify the composite template. It is used as a reference when adding document object information via a multi-part HTTP message. If used, the document content-disposition must include the &#x60;compositeTemplateId&#x60; to which the document should be added. If &#x60;compositeTemplateId&#x60; is not specified in the content-disposition, the document is applied based on the &#x60;documentId&#x60; only. If no document object is specified, the composite template inherits the first document.  * Server Templates are server-side templates stored on the DocuSign platform. If supplied, they are overlaid into the envelope in the order of their Sequence value.  * Inline Templates provide a container to add documents, recipients, tabs, and custom fields. If inline templates are supplied, they are overlaid into the envelope in the order of their Sequence value.  * Document objects are optional structures that provide a container to pass in a document or form. If this object is not included, the composite template inherits the *first* document it finds from a server template or inline template, starting with the lowest sequence value.  PDF Form objects are only transformed from the document object. DocuSign does not derive PDF form properties from server templates or inline templates. To instruct DocuSign to transform fields from the PDF form, set &#x60;transformPdfFields&#x60; to \&quot;true\&quot; for the document. See the Transform PDF Fields section for more information about process.  * PDF Metadata Templates provide a container to embed design-time template information into a PDF document. DocuSign uses this information when processing the Envelope. This convention allows the document to carry the signing instructions with it, so that less information needs to be provided at run-time through an inline template or synchronized with an external structure like a server template. PDF Metadata templates are stored in the Metadata layer of a PDF in accordance with Acrobat&#39;s XMP specification. DocuSign will only find PDF Metadata templates inside documents passed in the Document object (see below). If supplied, the PDF metadata template will be overlaid into the envelope in the order of its Sequence value.  ### Compositing the definitions Each Composite Template adds a new document and templates overlay into the envelope. For each Composite Template these rules are applied:  * Templates are overlaid in the order of their Sequence value. * If Document is not passed into the Composite Template&#39;s &#x60;document&#x60; field, the *first* template&#39;s document (based on the template&#39;s Sequence value) is used. * Last in wins in all cases except for the document (i.e. envelope information, recipient information, secure field information). There is no special casing.  For example, if you want higher security on a tab, then that needs to be specified in a later template (by sequence number) then where the tab is included. If you want higher security on a role recipient, then it needs to be in a later template then where that role recipient is specified.  * Recipient matching is based on Recipient Role and Routing Order. If there are matches, the recipient information is merged together. A final pass is done on all Composite Templates, after all template overlays have been applied, to collapse recipients with the same email, username and routing order. This prevents having the same recipients at the same routing order.  * If you specify in a template that a recipient is locked, once that recipient is overlaid the recipient attributes can no longer be changed. The only items that can be changed for the recipient in this case are the email, username, access code and IDCheckInformationInput.  * Tab matching is based on Tab Labels, Tab Types and Documents. If a Tab Label matches but the Document is not supplied, the Tab is overlaid for all the Documents.  For example, if you have a simple inline template with only one tab in it with a label and a value, the Signature, Initial, Company, Envelope ID, User Name tabs will only be matched and collapsed if they fall in the exact same X and Y locations.  * roleName and tabLabel matching is case sensitive.  * The defaultRecipient field enables you to specify which recipient the generated tabs from a PDF form are mapped to. You can also set PDF form generated tabs to a recipient other than the DefaultRecipient by specifying the mapping of the tab label that is created to one of the template recipients.  * You can use tabLabel wild carding to map a series of tabs from the PDF form. To use this you must end a tab label with \&quot;\\*\&quot; and then the system matches tabs that start with the label.  * If no DefaultRecipient is specified, tabs must be explicitly mapped to recipients in order to be generated from the form. Unmapped form objects will not be generated into their DocuSign equivalents. (In the case of Signature/Initials, the tabs will be disregarded entirely; in the case of pdf text fields, the field data will be flattened on the Envelope document, but there will not be a corresponding DocuSign data tab.)  ### Including the Document Content for Composite Templates Document content can be supplied inline, using the &#x60;documentBase64&#x60; or can be included in a multi-part HTTP message.  If a multi-part message is used and there are multiple Composite Templates, the document content-disposition can include the &#x60;compositeTemplateId&#x60; to which the document should be added. Using the &#x60;compositeTemplateId&#x60; sets which documents are associated with particular composite templates. An example of this usage is:  &#x60;&#x60;&#x60;    --5cd3320a-5aac-4453-b3a4-cbb52a4cba5d    Content-Type: application/pdf    Content-Disposition: file; filename&#x3D;\&quot;eula.pdf\&quot;; documentId&#x3D;1; compositeTemplateId&#x3D;\&quot;1\&quot;    Content-Transfer-Encoding: base64 &#x60;&#x60;&#x60;  ### PDF Form Field Transformation Only the following PDF Form FieldTypes will be transformed to DocuSign tabs: CheckBox, DateTime, ListBox, Numeric, Password, Radio, Signature, and Text  Field Properties that will be transformed: Read Only, Required, Max Length, Positions, and Initial Data.  When transforming a *PDF Form Digital Signature Field,* the following rules are used:  If the PDF Field Name Contains | Then the DocuSign Tab Will be ------- | -------- DocuSignSignHere or eSignSignHere | Signature DocuSignSignHereOptional or eSignSignHereOptional | Optional Signature DocuSignInitialHere or eSignInitialHere | Initials DocuSignInitialHereOptional or eSignInitialHereOptional | Optional Initials  Any other PDF Form Digital Signature Field will be transformed to a DocuSign Signature tab  When transforming *PDF Form Text Fields,* the following rules are used:  If the PDF Field Name Contains | Then the DocuSign Tab Will be ------- | -------- DocuSignSignHere or eSignSignHere | Signature DocuSignSignHereOptional or eSignSignHereOptional | Optional Signature DocuSignInitialHere or eSignInitialHere | Initials DocuSignInitialHereOptional or eSignInitialHereOptional | Optional Initials DocuSignEnvelopeID or eSignEnvelopeID | EnvelopeID DocuSignCompany or eSignCompany | Company DocuSignDateSigned or eSignDateSigned | Date Signed DocuSignTitle or eSignTitle | Title DocuSignFullName or eSignFullName |  Full Name DocuSignSignerAttachmentOptional or eSignSignerAttachmentOptional | Optional Signer Attachment  Any other PDF Form Text Field will be transformed to a DocuSign data (text) tab.  PDF Form Field Names that include \&quot;DocuSignIgnoreTransform\&quot; or \&quot;eSignIgnoreTransform\&quot; will not be transformed.  PDF Form Date fields will be transformed to Date Signed fields if their name includes DocuSignDateSigned or eSignDateSigned.  ## Template Email Subject Merge Fields This feature enables you to insert recipient name and email address merge fields into the email subject line when creating or sending from a template.  The merge fields, based on the recipient&#39;s &#x60;roleName&#x60;, are added to the &#x60;emailSubject&#x60; when the template is created or when the template is used to create an envelope. After a template sender adds the name and email information for the recipient and sends the envelope, the recipient information is automatically merged into the appropriate fields in the email subject line.  Both the sender and the recipients will see the information in the email subject line for any emails associated with the template. This provides an easy way for senders to organize their envelope emails without having to open an envelope to check the recipient.  If merging the recipient information into the subject line causes the subject line to exceed 100 characters, then any characters over the 100 character limit are not included in the subject line. For cases where the recipient name or email is expected to be long, you should consider placing the merge field at the start of the email subject.  * To add a recipient&#39;s name in the subject line add the following text in the &#x60;emailSubject&#x60; when creating the template or when sending an envelope from a template:     [[&lt;roleName&gt;_UserName]]     Example:     &#x60;\&quot;emailSubject\&quot;:\&quot;[[Signer 1_UserName]], Please sign this NDA\&quot;,&#x60;  * To add a recipient&#39;s email address in the subject line add the following text in the emailSubject when creating the template or when sending an envelope from a template:     [[&lt;roleName&gt;_Email]]     Example:     &#x60;\&quot;emailSubject\&quot;:\&quot;[[Signer 1_Email]], Please sign this NDA\&quot;,&#x60;  In both cases the &lt;roleName&gt; is the recipient&#39;s &#x60;roleName&#x60; in the template.  For cases where another recipient (such as an Agent, Editor, or Intermediary recipient) is entering the name and email information for the recipient included in the email subject, then [[&lt;roleName&gt;_UserName]] or [[&lt;roleName&gt;_Email]] is shown in the email subject.  ## Branding an envelope The following rules are used to determine the &#x60;brandId&#x60; used in an envelope:  * If a &#x60;brandId&#x60; is specified in the envelope/template and that brandId is available to the account, that brand is used in the envelope. * If more than one template is used in an envelope and more than one &#x60;brandId&#x60; is specified, the first &#x60;brandId&#x60; specified is used throughout the envelope. * In cases where no brand is specified and the sender belongs to a Group; if there is only one brand associated with the Group, then that brand is used in the envelope. Otherwise, the account&#39;s default signing brand is used. * For envelopes that do not meet any of the previous criteria, the account&#39;s default signing brand is used for the envelope.  ## BCC Email address feature  The BCC Email address feature is designed to provide a copy of all email communications for external archiving purposes. DocuSign recommends that envelopes sent using the BCC for Email Archive feature, including the BCC Email Override option, include additional signer authentication options. To send a copy of the envelope to a recipient who does not need to sign, don&#39;t use the BCC Email field. Use a Carbon Copy or Certified Delivery Recipient type.  ## Merge Recipient Roles for Draft Envelopes When an envelope with multiple templates is sent, the recipients from the templates are merged according to the template roles, and empty recipients are removed. When creating an envelope with multiple templates, but not sending it (keeping it in a created state), duplicate recipients are not merged, which could cause leave duplicate recipients in the envelope.  To prevent this, the query parameter &#x60;merge_roles_on_draft&#x60; should be added when posting a draft envelope (status&#x3D;created) with multiple templates. Doing this will merge template roles and remove empty recipients.  ###### Note: DocuSign recommends that the &#x60;merge_roles_on_draft&#x60; query parameter be used anytime you are creating an envelope with multiple templates and keeping it in draft (created) status.
  /// </summary>
  public class CreateEnvelopeOptions
  {
  private String cdseMode = null;
  private String changeRoutingOrder = null;
  private String completedDocumentsOnly = null;
  private String mergeRolesOnDraft = null;
  private String tabLabelExactMatches = null;
  /*
   * 
   */
  public void setCdseMode(String cdseMode) {
    this.cdseMode = cdseMode;
  }

  public String getCdseMode() {
    return this.cdseMode;
  }
  /*
   * 
   */
  public void setChangeRoutingOrder(String changeRoutingOrder) {
    this.changeRoutingOrder = changeRoutingOrder;
  }

  public String getChangeRoutingOrder() {
    return this.changeRoutingOrder;
  }
  /*
   * If set to true then we want to set the sourceEnvelopeId to indicate that this is a\&quot;forward\&quot; envelope action 
   */
  public void setCompletedDocumentsOnly(String completedDocumentsOnly) {
    this.completedDocumentsOnly = completedDocumentsOnly;
  }

  public String getCompletedDocumentsOnly() {
    return this.completedDocumentsOnly;
  }
  /*
   * When set to **true**, merges template roles and remove empty recipients when you create an envelope with multiple templates. 
   */
  public void setMergeRolesOnDraft(String mergeRolesOnDraft) {
    this.mergeRolesOnDraft = mergeRolesOnDraft;
  }

  public String getMergeRolesOnDraft() {
    return this.mergeRolesOnDraft;
  }
  /*
   * 
   */
  public void setTabLabelExactMatches(String tabLabelExactMatches) {
    this.tabLabelExactMatches = tabLabelExactMatches;
  }

  public String getTabLabelExactMatches() {
    return this.tabLabelExactMatches;
  }
  }

   /**
   * Creates an envelope.
   * Creates an envelope.   Using this function you can: * Create an envelope and send it. * Create an envelope from an existing template and send it.  In either case, you can choose to save the envelope as a draft envelope instead of sending it by setting the request&#39;s &#x60;status&#x60; property to &#x60;created&#x60; instead of &#x60;sent&#x60;.  ## Sending Envelopes  Documents can be included with the Envelopes::create call itself or a template can include documents. Documents can be added by using a multi-part/form request or by using the &#x60;documentBase64&#x60; field of the [&#x60;document&#x60; object](#/definitions/document)  ### Recipient Types An [&#x60;envelopeDefinition&#x60; object](#/definitions/envelopeDefinition) is used as the method&#39;s body. Envelope recipients can be defined in the envelope or in templates. The &#x60;envelopeDefinition&#x60; object&#39;s &#x60;recipients&#x60; field is an [&#x60;EnvelopeRecipients&#x60; resource object](#/definitions/EnvelopeRecipients). It includes arrays of the seven types of recipients defined by DocuSign:  Recipient type | Object definition -------------- | ----------------- agent (can add name and email information for later recipients/signers) | [&#x60;agent&#x60;](#/definitions/agent) carbon copy (receives a copy of the documents) | [&#x60;carbonCopy&#x60;](#/definitions/carbonCopy) certified delivery  (receives a copy of the documents and must acknowledge receipt) | [&#x60;certifiedDelivery&#x60;](#/definitions/certifiedDelivery) editor (can change recipients and document fields for later recipients/signers) | [&#x60;editor&#x60;](#/definitions/editor) in-person signer (\&quot;hosts\&quot; someone who signs in-person) | [&#x60;inPersonSigner&#x60;](#/definitions/inPersonSigner) intermediary (can add name and email information for some later recipients/signers.) | [&#x60;intermediary&#x60;](#/definitions/intermediary) signer (signs and/or updates document fields) | [&#x60;signer&#x60;](#/definitions/signer)  Additional information about the different types of recipients is available from the [&#x60;EnvelopeRecipients&#x60; resource page](../../EnvelopeRecipients) and from the [Developer Center](https://www.docusign.com/developer-center/explore/features/recipients)  ### Tabs Tabs (also referred to as &#x60;tags&#x60; and as &#x60;fields&#x60; in the web sending user interface), can be defined in the &#x60;envelopeDefinition&#x60;, in templates, by transforming PDF Form Fields, or by using Composite Templates (see below).  Defining tabs: the &#x60;inPersonSigner&#x60;, and &#x60;signer&#x60; recipient objects include a &#x60;tabs&#x60; field. It is an [&#x60;EnvelopeTabs&#x60; resource object](#/definitions/EnvelopeTabs). It includes arrays of the 24 different tab types available. See the [&#x60;EnvelopeTabs&#x60; resource](../../EnvelopeTabs) for more information.  ## Using Templates Envelopes use specific people or groups as recipients. Templates can specify a role, eg &#x60;account_manager.&#x60; When a template is used in an envelope, the roles must be replaced with specific people or groups.  When you create an envelope using a &#x60;templateId&#x60;, the different recipient type objects within the [&#x60;EnvelopeRecipients&#x60; object](#/definitions/EnvelopeRecipients) are used to assign recipients to the template&#39;s roles via the &#x60;roleName&#x60; property. The recipient objects can also override settings that were specified in the template, and set values for tab fields that were defined in the template.  ### Message Lock When a template is added or applied to an envelope and the template has a locked email subject and message, that subject and message are used for the envelope and cannot be changed even if another locked template is subsequently added or applied to the envelope. The field &#x60;messageLock&#x60; is used to lock the email subject and message.  If an email subject or message is entered before adding or applying a template with &#x60;messageLock&#x60; **true**, the email subject and message is overwritten with the locked email subject and message from the template.  ## Envelope Status The status of sent envelopes can be determined through the DocuSign webhook system or by polling. Webhooks are highly recommended: they provide your application with the quickest updates when an envelope&#39;s status changes. DocuSign limits polling to once every 15 minutes or less frequently.  When a webhook is used, DocuSign calls your application, via the URL you provide, with a notification XML message.   See the [Webhook recipe](https://www.docusign.com/developer-center/recipes/webhook-status) for examples and live demos of using webhooks.  ## Webhook Options The two webhook options, *eventNotification* and *Connect* use the same notification mechanism and message formats. eventNotification is used to create a webhook for a specific envelope sent via the API. Connect webhooks can be used for any envelope sent from an account, from any user, from any client.   ### eventNotification Webhooks The Envelopes::create method includes an optional [eventNotification object](#definition-eventNotification) that adds a webhook to the envelope. eventNotification webhooks are available for all DocuSign accounts with API access.  ### Connect Webhooks Connect can be used to create a webhook for all envelopes sent by all users in an account, either through the API or via other DocuSign clients (web, mobile, etc). Connect configurations are independent of specific envelopes. A Connect configuration includes a filter that may be used to limit the webhook to specific users, envelope statuses, etc.   Connect configurations may be created and managed using the [ConnectConfigurations resource](../../Connect/ConnectConfigurations). Configurations can also be created and managed from the Administration tool accessed by selecting \&quot;Go to Admin\&quot; from the menu next to your picture on the DocuSign web app. See the Integrations/Connect section of the Admin tool. For repeatability, and to minimize support questions, creating Connect configurations via the API is recommended, especially for ISVs.  Connect is available for some DocuSign account types. Please contact DocuSign Sales for more information.  ## Composite Templates  The Composite Templates feature, like [compositing in film production](https://en.wikipedia.org/wiki/Compositing), enables you to *overlay* document, recipient, and tab definitions from multiple sources, including PDF Form Field definitions, templates defined on the server, and more.  Each Composite Template consists of optional elements: server templates, inline templates, PDF Metadata templates, and documents.  * The Composite Template ID is an optional element used to identify the composite template. It is used as a reference when adding document object information via a multi-part HTTP message. If used, the document content-disposition must include the &#x60;compositeTemplateId&#x60; to which the document should be added. If &#x60;compositeTemplateId&#x60; is not specified in the content-disposition, the document is applied based on the &#x60;documentId&#x60; only. If no document object is specified, the composite template inherits the first document.  * Server Templates are server-side templates stored on the DocuSign platform. If supplied, they are overlaid into the envelope in the order of their Sequence value.  * Inline Templates provide a container to add documents, recipients, tabs, and custom fields. If inline templates are supplied, they are overlaid into the envelope in the order of their Sequence value.  * Document objects are optional structures that provide a container to pass in a document or form. If this object is not included, the composite template inherits the *first* document it finds from a server template or inline template, starting with the lowest sequence value.  PDF Form objects are only transformed from the document object. DocuSign does not derive PDF form properties from server templates or inline templates. To instruct DocuSign to transform fields from the PDF form, set &#x60;transformPdfFields&#x60; to \&quot;true\&quot; for the document. See the Transform PDF Fields section for more information about process.  * PDF Metadata Templates provide a container to embed design-time template information into a PDF document. DocuSign uses this information when processing the Envelope. This convention allows the document to carry the signing instructions with it, so that less information needs to be provided at run-time through an inline template or synchronized with an external structure like a server template. PDF Metadata templates are stored in the Metadata layer of a PDF in accordance with Acrobat&#39;s XMP specification. DocuSign will only find PDF Metadata templates inside documents passed in the Document object (see below). If supplied, the PDF metadata template will be overlaid into the envelope in the order of its Sequence value.  ### Compositing the definitions Each Composite Template adds a new document and templates overlay into the envelope. For each Composite Template these rules are applied:  * Templates are overlaid in the order of their Sequence value. * If Document is not passed into the Composite Template&#39;s &#x60;document&#x60; field, the *first* template&#39;s document (based on the template&#39;s Sequence value) is used. * Last in wins in all cases except for the document (i.e. envelope information, recipient information, secure field information). There is no special casing.  For example, if you want higher security on a tab, then that needs to be specified in a later template (by sequence number) then where the tab is included. If you want higher security on a role recipient, then it needs to be in a later template then where that role recipient is specified.  * Recipient matching is based on Recipient Role and Routing Order. If there are matches, the recipient information is merged together. A final pass is done on all Composite Templates, after all template overlays have been applied, to collapse recipients with the same email, username and routing order. This prevents having the same recipients at the same routing order.  * If you specify in a template that a recipient is locked, once that recipient is overlaid the recipient attributes can no longer be changed. The only items that can be changed for the recipient in this case are the email, username, access code and IDCheckInformationInput.  * Tab matching is based on Tab Labels, Tab Types and Documents. If a Tab Label matches but the Document is not supplied, the Tab is overlaid for all the Documents.  For example, if you have a simple inline template with only one tab in it with a label and a value, the Signature, Initial, Company, Envelope ID, User Name tabs will only be matched and collapsed if they fall in the exact same X and Y locations.  * roleName and tabLabel matching is case sensitive.  * The defaultRecipient field enables you to specify which recipient the generated tabs from a PDF form are mapped to. You can also set PDF form generated tabs to a recipient other than the DefaultRecipient by specifying the mapping of the tab label that is created to one of the template recipients.  * You can use tabLabel wild carding to map a series of tabs from the PDF form. To use this you must end a tab label with \&quot;\\*\&quot; and then the system matches tabs that start with the label.  * If no DefaultRecipient is specified, tabs must be explicitly mapped to recipients in order to be generated from the form. Unmapped form objects will not be generated into their DocuSign equivalents. (In the case of Signature/Initials, the tabs will be disregarded entirely; in the case of pdf text fields, the field data will be flattened on the Envelope document, but there will not be a corresponding DocuSign data tab.)  ### Including the Document Content for Composite Templates Document content can be supplied inline, using the &#x60;documentBase64&#x60; or can be included in a multi-part HTTP message.  If a multi-part message is used and there are multiple Composite Templates, the document content-disposition can include the &#x60;compositeTemplateId&#x60; to which the document should be added. Using the &#x60;compositeTemplateId&#x60; sets which documents are associated with particular composite templates. An example of this usage is:  &#x60;&#x60;&#x60;    --5cd3320a-5aac-4453-b3a4-cbb52a4cba5d    Content-Type: application/pdf    Content-Disposition: file; filename&#x3D;\&quot;eula.pdf\&quot;; documentId&#x3D;1; compositeTemplateId&#x3D;\&quot;1\&quot;    Content-Transfer-Encoding: base64 &#x60;&#x60;&#x60;  ### PDF Form Field Transformation Only the following PDF Form FieldTypes will be transformed to DocuSign tabs: CheckBox, DateTime, ListBox, Numeric, Password, Radio, Signature, and Text  Field Properties that will be transformed: Read Only, Required, Max Length, Positions, and Initial Data.  When transforming a *PDF Form Digital Signature Field,* the following rules are used:  If the PDF Field Name Contains | Then the DocuSign Tab Will be ------- | -------- DocuSignSignHere or eSignSignHere | Signature DocuSignSignHereOptional or eSignSignHereOptional | Optional Signature DocuSignInitialHere or eSignInitialHere | Initials DocuSignInitialHereOptional or eSignInitialHereOptional | Optional Initials  Any other PDF Form Digital Signature Field will be transformed to a DocuSign Signature tab  When transforming *PDF Form Text Fields,* the following rules are used:  If the PDF Field Name Contains | Then the DocuSign Tab Will be ------- | -------- DocuSignSignHere or eSignSignHere | Signature DocuSignSignHereOptional or eSignSignHereOptional | Optional Signature DocuSignInitialHere or eSignInitialHere | Initials DocuSignInitialHereOptional or eSignInitialHereOptional | Optional Initials DocuSignEnvelopeID or eSignEnvelopeID | EnvelopeID DocuSignCompany or eSignCompany | Company DocuSignDateSigned or eSignDateSigned | Date Signed DocuSignTitle or eSignTitle | Title DocuSignFullName or eSignFullName |  Full Name DocuSignSignerAttachmentOptional or eSignSignerAttachmentOptional | Optional Signer Attachment  Any other PDF Form Text Field will be transformed to a DocuSign data (text) tab.  PDF Form Field Names that include \&quot;DocuSignIgnoreTransform\&quot; or \&quot;eSignIgnoreTransform\&quot; will not be transformed.  PDF Form Date fields will be transformed to Date Signed fields if their name includes DocuSignDateSigned or eSignDateSigned.  ## Template Email Subject Merge Fields This feature enables you to insert recipient name and email address merge fields into the email subject line when creating or sending from a template.  The merge fields, based on the recipient&#39;s &#x60;roleName&#x60;, are added to the &#x60;emailSubject&#x60; when the template is created or when the template is used to create an envelope. After a template sender adds the name and email information for the recipient and sends the envelope, the recipient information is automatically merged into the appropriate fields in the email subject line.  Both the sender and the recipients will see the information in the email subject line for any emails associated with the template. This provides an easy way for senders to organize their envelope emails without having to open an envelope to check the recipient.  If merging the recipient information into the subject line causes the subject line to exceed 100 characters, then any characters over the 100 character limit are not included in the subject line. For cases where the recipient name or email is expected to be long, you should consider placing the merge field at the start of the email subject.  * To add a recipient&#39;s name in the subject line add the following text in the &#x60;emailSubject&#x60; when creating the template or when sending an envelope from a template:     [[&lt;roleName&gt;_UserName]]     Example:     &#x60;\&quot;emailSubject\&quot;:\&quot;[[Signer 1_UserName]], Please sign this NDA\&quot;,&#x60;  * To add a recipient&#39;s email address in the subject line add the following text in the emailSubject when creating the template or when sending an envelope from a template:     [[&lt;roleName&gt;_Email]]     Example:     &#x60;\&quot;emailSubject\&quot;:\&quot;[[Signer 1_Email]], Please sign this NDA\&quot;,&#x60;  In both cases the &lt;roleName&gt; is the recipient&#39;s &#x60;roleName&#x60; in the template.  For cases where another recipient (such as an Agent, Editor, or Intermediary recipient) is entering the name and email information for the recipient included in the email subject, then [[&lt;roleName&gt;_UserName]] or [[&lt;roleName&gt;_Email]] is shown in the email subject.  ## Branding an envelope The following rules are used to determine the &#x60;brandId&#x60; used in an envelope:  * If a &#x60;brandId&#x60; is specified in the envelope/template and that brandId is available to the account, that brand is used in the envelope. * If more than one template is used in an envelope and more than one &#x60;brandId&#x60; is specified, the first &#x60;brandId&#x60; specified is used throughout the envelope. * In cases where no brand is specified and the sender belongs to a Group; if there is only one brand associated with the Group, then that brand is used in the envelope. Otherwise, the account&#39;s default signing brand is used. * For envelopes that do not meet any of the previous criteria, the account&#39;s default signing brand is used for the envelope.  ## BCC Email address feature  The BCC Email address feature is designed to provide a copy of all email communications for external archiving purposes. DocuSign recommends that envelopes sent using the BCC for Email Archive feature, including the BCC Email Override option, include additional signer authentication options. To send a copy of the envelope to a recipient who does not need to sign, don&#39;t use the BCC Email field. Use a Carbon Copy or Certified Delivery Recipient type.  ## Merge Recipient Roles for Draft Envelopes When an envelope with multiple templates is sent, the recipients from the templates are merged according to the template roles, and empty recipients are removed. When creating an envelope with multiple templates, but not sending it (keeping it in a created state), duplicate recipients are not merged, which could cause leave duplicate recipients in the envelope.  To prevent this, the query parameter &#x60;merge_roles_on_draft&#x60; should be added when posting a draft envelope (status&#x3D;created) with multiple templates. Doing this will merge template roles and remove empty recipients.  ###### Note: DocuSign recommends that the &#x60;merge_roles_on_draft&#x60; query parameter be used anytime you are creating an envelope with multiple templates and keeping it in draft (created) status.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeDefinition  (optional)
   * @return EnvelopeSummary
   */ 
  public EnvelopeSummary createEnvelope(String accountId, EnvelopeDefinition envelopeDefinition) throws ApiException {
    return createEnvelope(accountId, envelopeDefinition, null);
  }

  /**
   * Creates an envelope.
   * Creates an envelope.   Using this function you can: * Create an envelope and send it. * Create an envelope from an existing template and send it.  In either case, you can choose to save the envelope as a draft envelope instead of sending it by setting the request&#39;s &#x60;status&#x60; property to &#x60;created&#x60; instead of &#x60;sent&#x60;.  ## Sending Envelopes  Documents can be included with the Envelopes::create call itself or a template can include documents. Documents can be added by using a multi-part/form request or by using the &#x60;documentBase64&#x60; field of the [&#x60;document&#x60; object](#/definitions/document)  ### Recipient Types An [&#x60;envelopeDefinition&#x60; object](#/definitions/envelopeDefinition) is used as the method&#39;s body. Envelope recipients can be defined in the envelope or in templates. The &#x60;envelopeDefinition&#x60; object&#39;s &#x60;recipients&#x60; field is an [&#x60;EnvelopeRecipients&#x60; resource object](#/definitions/EnvelopeRecipients). It includes arrays of the seven types of recipients defined by DocuSign:  Recipient type | Object definition -------------- | ----------------- agent (can add name and email information for later recipients/signers) | [&#x60;agent&#x60;](#/definitions/agent) carbon copy (receives a copy of the documents) | [&#x60;carbonCopy&#x60;](#/definitions/carbonCopy) certified delivery  (receives a copy of the documents and must acknowledge receipt) | [&#x60;certifiedDelivery&#x60;](#/definitions/certifiedDelivery) editor (can change recipients and document fields for later recipients/signers) | [&#x60;editor&#x60;](#/definitions/editor) in-person signer (\&quot;hosts\&quot; someone who signs in-person) | [&#x60;inPersonSigner&#x60;](#/definitions/inPersonSigner) intermediary (can add name and email information for some later recipients/signers.) | [&#x60;intermediary&#x60;](#/definitions/intermediary) signer (signs and/or updates document fields) | [&#x60;signer&#x60;](#/definitions/signer)  Additional information about the different types of recipients is available from the [&#x60;EnvelopeRecipients&#x60; resource page](../../EnvelopeRecipients) and from the [Developer Center](https://www.docusign.com/developer-center/explore/features/recipients)  ### Tabs Tabs (also referred to as &#x60;tags&#x60; and as &#x60;fields&#x60; in the web sending user interface), can be defined in the &#x60;envelopeDefinition&#x60;, in templates, by transforming PDF Form Fields, or by using Composite Templates (see below).  Defining tabs: the &#x60;inPersonSigner&#x60;, and &#x60;signer&#x60; recipient objects include a &#x60;tabs&#x60; field. It is an [&#x60;EnvelopeTabs&#x60; resource object](#/definitions/EnvelopeTabs). It includes arrays of the 24 different tab types available. See the [&#x60;EnvelopeTabs&#x60; resource](../../EnvelopeTabs) for more information.  ## Using Templates Envelopes use specific people or groups as recipients. Templates can specify a role, eg &#x60;account_manager.&#x60; When a template is used in an envelope, the roles must be replaced with specific people or groups.  When you create an envelope using a &#x60;templateId&#x60;, the different recipient type objects within the [&#x60;EnvelopeRecipients&#x60; object](#/definitions/EnvelopeRecipients) are used to assign recipients to the template&#39;s roles via the &#x60;roleName&#x60; property. The recipient objects can also override settings that were specified in the template, and set values for tab fields that were defined in the template.  ### Message Lock When a template is added or applied to an envelope and the template has a locked email subject and message, that subject and message are used for the envelope and cannot be changed even if another locked template is subsequently added or applied to the envelope. The field &#x60;messageLock&#x60; is used to lock the email subject and message.  If an email subject or message is entered before adding or applying a template with &#x60;messageLock&#x60; **true**, the email subject and message is overwritten with the locked email subject and message from the template.  ## Envelope Status The status of sent envelopes can be determined through the DocuSign webhook system or by polling. Webhooks are highly recommended: they provide your application with the quickest updates when an envelope&#39;s status changes. DocuSign limits polling to once every 15 minutes or less frequently.  When a webhook is used, DocuSign calls your application, via the URL you provide, with a notification XML message.   See the [Webhook recipe](https://www.docusign.com/developer-center/recipes/webhook-status) for examples and live demos of using webhooks.  ## Webhook Options The two webhook options, *eventNotification* and *Connect* use the same notification mechanism and message formats. eventNotification is used to create a webhook for a specific envelope sent via the API. Connect webhooks can be used for any envelope sent from an account, from any user, from any client.   ### eventNotification Webhooks The Envelopes::create method includes an optional [eventNotification object](#definition-eventNotification) that adds a webhook to the envelope. eventNotification webhooks are available for all DocuSign accounts with API access.  ### Connect Webhooks Connect can be used to create a webhook for all envelopes sent by all users in an account, either through the API or via other DocuSign clients (web, mobile, etc). Connect configurations are independent of specific envelopes. A Connect configuration includes a filter that may be used to limit the webhook to specific users, envelope statuses, etc.   Connect configurations may be created and managed using the [ConnectConfigurations resource](../../Connect/ConnectConfigurations). Configurations can also be created and managed from the Administration tool accessed by selecting \&quot;Go to Admin\&quot; from the menu next to your picture on the DocuSign web app. See the Integrations/Connect section of the Admin tool. For repeatability, and to minimize support questions, creating Connect configurations via the API is recommended, especially for ISVs.  Connect is available for some DocuSign account types. Please contact DocuSign Sales for more information.  ## Composite Templates  The Composite Templates feature, like [compositing in film production](https://en.wikipedia.org/wiki/Compositing), enables you to *overlay* document, recipient, and tab definitions from multiple sources, including PDF Form Field definitions, templates defined on the server, and more.  Each Composite Template consists of optional elements: server templates, inline templates, PDF Metadata templates, and documents.  * The Composite Template ID is an optional element used to identify the composite template. It is used as a reference when adding document object information via a multi-part HTTP message. If used, the document content-disposition must include the &#x60;compositeTemplateId&#x60; to which the document should be added. If &#x60;compositeTemplateId&#x60; is not specified in the content-disposition, the document is applied based on the &#x60;documentId&#x60; only. If no document object is specified, the composite template inherits the first document.  * Server Templates are server-side templates stored on the DocuSign platform. If supplied, they are overlaid into the envelope in the order of their Sequence value.  * Inline Templates provide a container to add documents, recipients, tabs, and custom fields. If inline templates are supplied, they are overlaid into the envelope in the order of their Sequence value.  * Document objects are optional structures that provide a container to pass in a document or form. If this object is not included, the composite template inherits the *first* document it finds from a server template or inline template, starting with the lowest sequence value.  PDF Form objects are only transformed from the document object. DocuSign does not derive PDF form properties from server templates or inline templates. To instruct DocuSign to transform fields from the PDF form, set &#x60;transformPdfFields&#x60; to \&quot;true\&quot; for the document. See the Transform PDF Fields section for more information about process.  * PDF Metadata Templates provide a container to embed design-time template information into a PDF document. DocuSign uses this information when processing the Envelope. This convention allows the document to carry the signing instructions with it, so that less information needs to be provided at run-time through an inline template or synchronized with an external structure like a server template. PDF Metadata templates are stored in the Metadata layer of a PDF in accordance with Acrobat&#39;s XMP specification. DocuSign will only find PDF Metadata templates inside documents passed in the Document object (see below). If supplied, the PDF metadata template will be overlaid into the envelope in the order of its Sequence value.  ### Compositing the definitions Each Composite Template adds a new document and templates overlay into the envelope. For each Composite Template these rules are applied:  * Templates are overlaid in the order of their Sequence value. * If Document is not passed into the Composite Template&#39;s &#x60;document&#x60; field, the *first* template&#39;s document (based on the template&#39;s Sequence value) is used. * Last in wins in all cases except for the document (i.e. envelope information, recipient information, secure field information). There is no special casing.  For example, if you want higher security on a tab, then that needs to be specified in a later template (by sequence number) then where the tab is included. If you want higher security on a role recipient, then it needs to be in a later template then where that role recipient is specified.  * Recipient matching is based on Recipient Role and Routing Order. If there are matches, the recipient information is merged together. A final pass is done on all Composite Templates, after all template overlays have been applied, to collapse recipients with the same email, username and routing order. This prevents having the same recipients at the same routing order.  * If you specify in a template that a recipient is locked, once that recipient is overlaid the recipient attributes can no longer be changed. The only items that can be changed for the recipient in this case are the email, username, access code and IDCheckInformationInput.  * Tab matching is based on Tab Labels, Tab Types and Documents. If a Tab Label matches but the Document is not supplied, the Tab is overlaid for all the Documents.  For example, if you have a simple inline template with only one tab in it with a label and a value, the Signature, Initial, Company, Envelope ID, User Name tabs will only be matched and collapsed if they fall in the exact same X and Y locations.  * roleName and tabLabel matching is case sensitive.  * The defaultRecipient field enables you to specify which recipient the generated tabs from a PDF form are mapped to. You can also set PDF form generated tabs to a recipient other than the DefaultRecipient by specifying the mapping of the tab label that is created to one of the template recipients.  * You can use tabLabel wild carding to map a series of tabs from the PDF form. To use this you must end a tab label with \&quot;\\*\&quot; and then the system matches tabs that start with the label.  * If no DefaultRecipient is specified, tabs must be explicitly mapped to recipients in order to be generated from the form. Unmapped form objects will not be generated into their DocuSign equivalents. (In the case of Signature/Initials, the tabs will be disregarded entirely; in the case of pdf text fields, the field data will be flattened on the Envelope document, but there will not be a corresponding DocuSign data tab.)  ### Including the Document Content for Composite Templates Document content can be supplied inline, using the &#x60;documentBase64&#x60; or can be included in a multi-part HTTP message.  If a multi-part message is used and there are multiple Composite Templates, the document content-disposition can include the &#x60;compositeTemplateId&#x60; to which the document should be added. Using the &#x60;compositeTemplateId&#x60; sets which documents are associated with particular composite templates. An example of this usage is:  &#x60;&#x60;&#x60;    --5cd3320a-5aac-4453-b3a4-cbb52a4cba5d    Content-Type: application/pdf    Content-Disposition: file; filename&#x3D;\&quot;eula.pdf\&quot;; documentId&#x3D;1; compositeTemplateId&#x3D;\&quot;1\&quot;    Content-Transfer-Encoding: base64 &#x60;&#x60;&#x60;  ### PDF Form Field Transformation Only the following PDF Form FieldTypes will be transformed to DocuSign tabs: CheckBox, DateTime, ListBox, Numeric, Password, Radio, Signature, and Text  Field Properties that will be transformed: Read Only, Required, Max Length, Positions, and Initial Data.  When transforming a *PDF Form Digital Signature Field,* the following rules are used:  If the PDF Field Name Contains | Then the DocuSign Tab Will be ------- | -------- DocuSignSignHere or eSignSignHere | Signature DocuSignSignHereOptional or eSignSignHereOptional | Optional Signature DocuSignInitialHere or eSignInitialHere | Initials DocuSignInitialHereOptional or eSignInitialHereOptional | Optional Initials  Any other PDF Form Digital Signature Field will be transformed to a DocuSign Signature tab  When transforming *PDF Form Text Fields,* the following rules are used:  If the PDF Field Name Contains | Then the DocuSign Tab Will be ------- | -------- DocuSignSignHere or eSignSignHere | Signature DocuSignSignHereOptional or eSignSignHereOptional | Optional Signature DocuSignInitialHere or eSignInitialHere | Initials DocuSignInitialHereOptional or eSignInitialHereOptional | Optional Initials DocuSignEnvelopeID or eSignEnvelopeID | EnvelopeID DocuSignCompany or eSignCompany | Company DocuSignDateSigned or eSignDateSigned | Date Signed DocuSignTitle or eSignTitle | Title DocuSignFullName or eSignFullName |  Full Name DocuSignSignerAttachmentOptional or eSignSignerAttachmentOptional | Optional Signer Attachment  Any other PDF Form Text Field will be transformed to a DocuSign data (text) tab.  PDF Form Field Names that include \&quot;DocuSignIgnoreTransform\&quot; or \&quot;eSignIgnoreTransform\&quot; will not be transformed.  PDF Form Date fields will be transformed to Date Signed fields if their name includes DocuSignDateSigned or eSignDateSigned.  ## Template Email Subject Merge Fields This feature enables you to insert recipient name and email address merge fields into the email subject line when creating or sending from a template.  The merge fields, based on the recipient&#39;s &#x60;roleName&#x60;, are added to the &#x60;emailSubject&#x60; when the template is created or when the template is used to create an envelope. After a template sender adds the name and email information for the recipient and sends the envelope, the recipient information is automatically merged into the appropriate fields in the email subject line.  Both the sender and the recipients will see the information in the email subject line for any emails associated with the template. This provides an easy way for senders to organize their envelope emails without having to open an envelope to check the recipient.  If merging the recipient information into the subject line causes the subject line to exceed 100 characters, then any characters over the 100 character limit are not included in the subject line. For cases where the recipient name or email is expected to be long, you should consider placing the merge field at the start of the email subject.  * To add a recipient&#39;s name in the subject line add the following text in the &#x60;emailSubject&#x60; when creating the template or when sending an envelope from a template:     [[&lt;roleName&gt;_UserName]]     Example:     &#x60;\&quot;emailSubject\&quot;:\&quot;[[Signer 1_UserName]], Please sign this NDA\&quot;,&#x60;  * To add a recipient&#39;s email address in the subject line add the following text in the emailSubject when creating the template or when sending an envelope from a template:     [[&lt;roleName&gt;_Email]]     Example:     &#x60;\&quot;emailSubject\&quot;:\&quot;[[Signer 1_Email]], Please sign this NDA\&quot;,&#x60;  In both cases the &lt;roleName&gt; is the recipient&#39;s &#x60;roleName&#x60; in the template.  For cases where another recipient (such as an Agent, Editor, or Intermediary recipient) is entering the name and email information for the recipient included in the email subject, then [[&lt;roleName&gt;_UserName]] or [[&lt;roleName&gt;_Email]] is shown in the email subject.  ## Branding an envelope The following rules are used to determine the &#x60;brandId&#x60; used in an envelope:  * If a &#x60;brandId&#x60; is specified in the envelope/template and that brandId is available to the account, that brand is used in the envelope. * If more than one template is used in an envelope and more than one &#x60;brandId&#x60; is specified, the first &#x60;brandId&#x60; specified is used throughout the envelope. * In cases where no brand is specified and the sender belongs to a Group; if there is only one brand associated with the Group, then that brand is used in the envelope. Otherwise, the account&#39;s default signing brand is used. * For envelopes that do not meet any of the previous criteria, the account&#39;s default signing brand is used for the envelope.  ## BCC Email address feature  The BCC Email address feature is designed to provide a copy of all email communications for external archiving purposes. DocuSign recommends that envelopes sent using the BCC for Email Archive feature, including the BCC Email Override option, include additional signer authentication options. To send a copy of the envelope to a recipient who does not need to sign, don&#39;t use the BCC Email field. Use a Carbon Copy or Certified Delivery Recipient type.  ## Merge Recipient Roles for Draft Envelopes When an envelope with multiple templates is sent, the recipients from the templates are merged according to the template roles, and empty recipients are removed. When creating an envelope with multiple templates, but not sending it (keeping it in a created state), duplicate recipients are not merged, which could cause leave duplicate recipients in the envelope.  To prevent this, the query parameter &#x60;merge_roles_on_draft&#x60; should be added when posting a draft envelope (status&#x3D;created) with multiple templates. Doing this will merge template roles and remove empty recipients.  ###### Note: DocuSign recommends that the &#x60;merge_roles_on_draft&#x60; query parameter be used anytime you are creating an envelope with multiple templates and keeping it in draft (created) status.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeDefinition  (optional)
   * @param options for modifying the method behavior.
   * @return EnvelopeSummary
   * @throws ApiException if fails to make API call
   */
  public EnvelopeSummary createEnvelope(String accountId, EnvelopeDefinition envelopeDefinition, EnvelopesApi.CreateEnvelopeOptions options) throws ApiException {
    Object localVarPostBody = envelopeDefinition;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createEnvelope");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("cdse_mode", options.cdseMode));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("change_routing_order", options.changeRoutingOrder));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("completed_documents_only", options.completedDocumentsOnly));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("merge_roles_on_draft", options.mergeRolesOnDraft));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("tab_label_exact_matches", options.tabLabelExactMatches));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<EnvelopeSummary> localVarReturnType = new GenericType<EnvelopeSummary>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Posts a list of comments for authorized user
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param commentsPublish  (optional)
   * @return CommentHistoryResult
   * @throws ApiException if fails to make API call
   */
  public CommentHistoryResult createEnvelopeComments(String accountId, String envelopeId, CommentsPublish commentsPublish) throws ApiException {
    Object localVarPostBody = commentsPublish;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createEnvelopeComments");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createEnvelopeComments");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/comments"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    GenericType<CommentHistoryResult> localVarReturnType = new GenericType<CommentHistoryResult>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Provides a URL to start a recipient view of the Envelope UI
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientPreviewRequest  (optional)
   * @return ViewUrl
   * @throws ApiException if fails to make API call
   */
  public ViewUrl createEnvelopeRecipientPreview(String accountId, String envelopeId, RecipientPreviewRequest recipientPreviewRequest) throws ApiException {
    Object localVarPostBody = recipientPreviewRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createEnvelopeRecipientPreview");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createEnvelopeRecipientPreview");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/views/recipient_preview"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    GenericType<ViewUrl> localVarReturnType = new GenericType<ViewUrl>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Provides a URL to start a shared recipient view of the Envelope UI
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientViewRequest  (optional)
   * @return ViewUrl
   * @throws ApiException if fails to make API call
   */
  public ViewUrl createEnvelopeRecipientSharedView(String accountId, String envelopeId, RecipientViewRequest recipientViewRequest) throws ApiException {
    Object localVarPostBody = recipientViewRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createEnvelopeRecipientSharedView");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createEnvelopeRecipientSharedView");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/views/shared"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    GenericType<ViewUrl> localVarReturnType = new GenericType<ViewUrl>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Add envelope transfer rules to an account.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeTransferRuleRequest  (optional)
   * @return EnvelopeTransferRuleInformation
   * @throws ApiException if fails to make API call
   */
  public EnvelopeTransferRuleInformation createEnvelopeTransferRules(String accountId, EnvelopeTransferRuleRequest envelopeTransferRuleRequest) throws ApiException {
    Object localVarPostBody = envelopeTransferRuleRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createEnvelopeTransferRules");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/transfer_rules"
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

    GenericType<EnvelopeTransferRuleInformation> localVarReturnType = new GenericType<EnvelopeTransferRuleInformation>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Uploads Kazmon error for Display Appliance
   * 
   * @throws ApiException if fails to make API call
   */
  public void createError() throws ApiException {
    Object localVarPostBody = "{}";
    
    // create path and map variables
    String localVarPath = "/v2.1/display_appliance_info/error";

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


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }

  /**
   * Lock an envelope.
   * Locks the specified envelope, and sets the time until the lock expires, to prevent other users or recipients from accessing and changing the envelope.  ###### Note: Users must have envelope locking capability enabled to use this function (userSetting &#x60;canLockEnvelopes&#x60; must be  set to true for the user).
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param lockRequest  (optional)
   * @return LockInformation
   * @throws ApiException if fails to make API call
   */
  public LockInformation createLock(String accountId, String envelopeId, LockRequest lockRequest) throws ApiException {
    Object localVarPostBody = lockRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createLock");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createLock");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/lock"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    GenericType<LockInformation> localVarReturnType = new GenericType<LockInformation>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Create page information for Display Appliance
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @throws ApiException if fails to make API call
   */
  public void createPageInfo(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createPageInfo");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createPageInfo");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/display_appliance_info/page_info"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }

  /**
   * Add pdf blobs for Display Appliance
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return DisplayAppliancePdf
   * @throws ApiException if fails to make API call
   */
  public DisplayAppliancePdf createPdfBlob(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createPdfBlob");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createPdfBlob");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/display_appliance_info/pdf_blobs"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    GenericType<DisplayAppliancePdf> localVarReturnType = new GenericType<DisplayAppliancePdf>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Adds one or more recipients to an envelope. Adds one or more recipients to an envelope.  For an in process envelope, one that has been sent and has not been completed or voided, an email is sent to a new recipient when they are reached in the routing order. If the new recipient&#39;s routing order is before or the same as the envelope&#39;s next recipient, an email is only sent if the optional &#x60;resend_envelope&#x60; query string is set to **true**.
  /// </summary>
  public class CreateRecipientOptions
  {
  private String resendEnvelope = null;
  /*
   * When set to **true**, resends the   envelope if the new recipient&#39;s routing order is before or the same as the envelope&#39;s next recipient. 
   */
  public void setResendEnvelope(String resendEnvelope) {
    this.resendEnvelope = resendEnvelope;
  }

  public String getResendEnvelope() {
    return this.resendEnvelope;
  }
  }

   /**
   * Adds one or more recipients to an envelope.
   * Adds one or more recipients to an envelope.  For an in process envelope, one that has been sent and has not been completed or voided, an email is sent to a new recipient when they are reached in the routing order. If the new recipient&#39;s routing order is before or the same as the envelope&#39;s next recipient, an email is only sent if the optional &#x60;resend_envelope&#x60; query string is set to **true**.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipients  (optional)
   * @return Recipients
   */ 
  public Recipients createRecipient(String accountId, String envelopeId, Recipients recipients) throws ApiException {
    return createRecipient(accountId, envelopeId, recipients, null);
  }

  /**
   * Adds one or more recipients to an envelope.
   * Adds one or more recipients to an envelope.  For an in process envelope, one that has been sent and has not been completed or voided, an email is sent to a new recipient when they are reached in the routing order. If the new recipient&#39;s routing order is before or the same as the envelope&#39;s next recipient, an email is only sent if the optional &#x60;resend_envelope&#x60; query string is set to **true**.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipients  (optional)
   * @param options for modifying the method behavior.
   * @return Recipients
   * @throws ApiException if fails to make API call
   */
  public Recipients createRecipient(String accountId, String envelopeId, Recipients recipients, EnvelopesApi.CreateRecipientOptions options) throws ApiException {
    Object localVarPostBody = recipients;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createRecipient");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createRecipient");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/recipients"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("resend_envelope", options.resendEnvelope));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<Recipients> localVarReturnType = new GenericType<Recipients>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Provides a link to access the Identity manual review related to a recipient.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @return ViewUrl
   * @throws ApiException if fails to make API call
   */
  public ViewUrl createRecipientManualReviewView(String accountId, String envelopeId, String recipientId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createRecipientManualReviewView");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createRecipientManualReviewView");
    }
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling createRecipientManualReviewView");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/views/identity_manual_review"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

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

    GenericType<ViewUrl> localVarReturnType = new GenericType<ViewUrl>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Returns a link to access to the identity events stored in the proof service related to this recipient.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @return ProofServiceViewLink
   * @throws ApiException if fails to make API call
   */
  public ProofServiceViewLink createRecipientProofFileLink(String accountId, String envelopeId, String recipientId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createRecipientProofFileLink");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createRecipientProofFileLink");
    }
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling createRecipientProofFileLink");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/identity_proof"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

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

    GenericType<ProofServiceViewLink> localVarReturnType = new GenericType<ProofServiceViewLink>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Returns a resource token to get access to the identity events stored in the proof service related to this recipient.
   * 
   * @param tokenScopes  (required)
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @return ProofServiceResourceToken
   * @throws ApiException if fails to make API call
   */
  public ProofServiceResourceToken createRecipientProofFileResourceToken(String tokenScopes, String accountId, String envelopeId, String recipientId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'tokenScopes' is set
    if (tokenScopes == null) {
      throw new ApiException(400, "Missing the required parameter 'tokenScopes' when calling createRecipientProofFileResourceToken");
    }
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createRecipientProofFileResourceToken");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createRecipientProofFileResourceToken");
    }
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling createRecipientProofFileResourceToken");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/identity_proof_token"
      .replaceAll("\\{" + "token_scopes" + "\\}", apiClient.escapeString(tokenScopes.toString()))
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

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

    GenericType<ProofServiceResourceToken> localVarReturnType = new GenericType<ProofServiceResourceToken>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Returns a URL to the recipient view UI.
   * Returns a URL that allows you to embed the recipient view of the DocuSign UI in your applications. This call cannot be used to view draft envelopes, since those envelopes have not been sent.   Important: iFrames should not be used for embedded operations on mobile devices due to screen space issues. For iOS devices DocuSign recommends using a WebView.   An entry is added into the Security Level section of the DocuSign Certificate of Completion that reflects the &#x60;securityDomain&#x60; and &#x60;authenticationMethod&#x60; properties used to verify the user identity.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientViewRequest  (optional)
   * @return ViewUrl
   * @throws ApiException if fails to make API call
   */
  public ViewUrl createRecipientView(String accountId, String envelopeId, RecipientViewRequest recipientViewRequest) throws ApiException {
    Object localVarPostBody = recipientViewRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createRecipientView");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createRecipientView");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/views/recipient"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    GenericType<ViewUrl> localVarReturnType = new GenericType<ViewUrl>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Returns signing url for Display Appliance
   * 
   * @return DisplayApplianceInfo
   * @throws ApiException if fails to make API call
   */
  public DisplayApplianceInfo createRedeem() throws ApiException {
    Object localVarPostBody = "{}";
    
    // create path and map variables
    String localVarPath = "/v2.1/display_appliance_info/redeem";

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

    GenericType<DisplayApplianceInfo> localVarReturnType = new GenericType<DisplayApplianceInfo>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Get Responsive HTML Preview for all documents in an envelope.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentHtmlDefinition  (optional)
   * @return DocumentHtmlDefinitions
   * @throws ApiException if fails to make API call
   */
  public DocumentHtmlDefinitions createResponsiveHtmlPreview(String accountId, String envelopeId, DocumentHtmlDefinition documentHtmlDefinition) throws ApiException {
    Object localVarPostBody = documentHtmlDefinition;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createResponsiveHtmlPreview");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createResponsiveHtmlPreview");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/responsive_html_preview"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    GenericType<DocumentHtmlDefinitions> localVarReturnType = new GenericType<DocumentHtmlDefinitions>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Returns a URL to the sender view UI.
   * Returns a URL that allows you to embed the sender view of the DocuSign UI in your applications. This is a one-time use login token that allows the user to be placed into the DocuSign sending view.   Upon sending completion, the user is returned to the return URL provided by the API application.  Important: iFrames should not be used for embedded operations on mobile devices due to screen space issues. For iOS devices DocuSign recommends using a WebView. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param returnUrlRequest  (optional)
   * @return ViewUrl
   * @throws ApiException if fails to make API call
   */
  public ViewUrl createSenderView(String accountId, String envelopeId, ReturnUrlRequest returnUrlRequest) throws ApiException {
    Object localVarPostBody = returnUrlRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createSenderView");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createSenderView");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/views/sender"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    GenericType<ViewUrl> localVarReturnType = new GenericType<ViewUrl>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Adds tabs for a recipient.
   * Adds one or more tabs for a recipient.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param tabs  (optional)
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public Tabs createTabs(String accountId, String envelopeId, String recipientId, Tabs tabs) throws ApiException {
    Object localVarPostBody = tabs;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createTabs");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling createTabs");
    }
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling createTabs");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/tabs"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

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

    GenericType<Tabs> localVarReturnType = new GenericType<Tabs>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Delete one or more attachments from a DRAFT envelope.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param envelopeAttachmentsRequest  (optional)
   * @return EnvelopeAttachmentsResult
   * @throws ApiException if fails to make API call
   */
  public EnvelopeAttachmentsResult deleteAttachments(String accountId, String envelopeId, EnvelopeAttachmentsRequest envelopeAttachmentsRequest) throws ApiException {
    Object localVarPostBody = envelopeAttachmentsRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteAttachments");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteAttachments");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/attachments"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    GenericType<EnvelopeAttachmentsResult> localVarReturnType = new GenericType<EnvelopeAttachmentsResult>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Delete an existing ChunkedUpload.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param chunkedUploadId  (required)
   * @return ChunkedUploadResponse
   * @throws ApiException if fails to make API call
   */
  public ChunkedUploadResponse deleteChunkedUpload(String accountId, String chunkedUploadId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteChunkedUpload");
    }
    
    // verify the required parameter 'chunkedUploadId' is set
    if (chunkedUploadId == null) {
      throw new ApiException(400, "Missing the required parameter 'chunkedUploadId' when calling deleteChunkedUpload");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/chunked_uploads/{chunkedUploadId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "chunkedUploadId" + "\\}", apiClient.escapeString(chunkedUploadId.toString()));

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

    GenericType<ChunkedUploadResponse> localVarReturnType = new GenericType<ChunkedUploadResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Deletes envelope custom fields for draft and in-process envelopes.
   * Deletes envelope custom fields for draft and in-process envelopes.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param customFields  (optional)
   * @return CustomFields
   * @throws ApiException if fails to make API call
   */
  public CustomFields deleteCustomFields(String accountId, String envelopeId, CustomFields customFields) throws ApiException {
    Object localVarPostBody = customFields;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteCustomFields");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/custom_fields"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Delete custom fields information for Display Appliance
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteCustomFields_0(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteCustomFields_0");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteCustomFields_0");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/display_appliance_info/custom_fields/delete"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }

  /**
   * Delete document information for Display Appliance
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteDocument(String accountId, String envelopeId, String documentId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteDocument");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteDocument");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling deleteDocument");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/display_appliance_info/document/{documentId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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
   * Deletes custom document fields from an existing envelope document.
   * Deletes custom document fields from an existing envelope document.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param documentFieldsInformation  (optional)
   * @return DocumentFieldsInformation
   * @throws ApiException if fails to make API call
   */
  public DocumentFieldsInformation deleteDocumentFields(String accountId, String envelopeId, String documentId, DocumentFieldsInformation documentFieldsInformation) throws ApiException {
    Object localVarPostBody = documentFieldsInformation;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteDocumentFields");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteDocumentFields");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling deleteDocumentFields");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/fields"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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

    GenericType<DocumentFieldsInformation> localVarReturnType = new GenericType<DocumentFieldsInformation>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Deletes a page from a document in an envelope.
   * Deletes a page from a document in an envelope based on the page number.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param pageNumber The page number being accessed. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteDocumentPage(String accountId, String envelopeId, String documentId, String pageNumber) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteDocumentPage");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteDocumentPage");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling deleteDocumentPage");
    }
    
    // verify the required parameter 'pageNumber' is set
    if (pageNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'pageNumber' when calling deleteDocumentPage");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/pages/{pageNumber}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()))
      .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(pageNumber.toString()));

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
   * Deletes tabs from an envelope document
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param tabs  (optional)
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public Tabs deleteDocumentTabs(String accountId, String envelopeId, String documentId, Tabs tabs) throws ApiException {
    Object localVarPostBody = tabs;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteDocumentTabs");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteDocumentTabs");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling deleteDocumentTabs");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/tabs"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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

    GenericType<Tabs> localVarReturnType = new GenericType<Tabs>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Deletes documents from a draft envelope.
   * Deletes one or more documents from an existing draft envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param envelopeDefinition  (optional)
   * @return EnvelopeDocumentsResult
   * @throws ApiException if fails to make API call
   */
  public EnvelopeDocumentsResult deleteDocuments(String accountId, String envelopeId, EnvelopeDefinition envelopeDefinition) throws ApiException {
    Object localVarPostBody = envelopeDefinition;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteDocuments");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteDocuments");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    GenericType<EnvelopeDocumentsResult> localVarReturnType = new GenericType<EnvelopeDocumentsResult>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Deletes the email setting overrides for an envelope.
   * Deletes all existing email override settings for the envelope. If you want to delete an individual email override setting, use the PUT and set the value to an empty string. Note that deleting email settings will only affect email communications that occur after the deletion and the normal account email settings are used for future email communications.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return EmailSettings
   * @throws ApiException if fails to make API call
   */
  public EmailSettings deleteEmailSettings(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteEmailSettings");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteEmailSettings");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/email_settings"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    GenericType<EmailSettings> localVarReturnType = new GenericType<EmailSettings>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Revokes the correction view URL to the Envelope UI
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param correctViewRequest  (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteEnvelopeCorrectView(String accountId, String envelopeId, CorrectViewRequest correctViewRequest) throws ApiException {
    Object localVarPostBody = correctViewRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteEnvelopeCorrectView");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteEnvelopeCorrectView");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/views/correct"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
   * Delete envelope transfer rules for an account.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeTransferRuleId  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteEnvelopeTransferRules(String accountId, String envelopeTransferRuleId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteEnvelopeTransferRules");
    }
    
    // verify the required parameter 'envelopeTransferRuleId' is set
    if (envelopeTransferRuleId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeTransferRuleId' when calling deleteEnvelopeTransferRules");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/transfer_rules/{envelopeTransferRuleId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeTransferRuleId" + "\\}", apiClient.escapeString(envelopeTransferRuleId.toString()));

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
   * Delete the workflow definition for an envelope.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteEnvelopeWorkflowDefinition(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteEnvelopeWorkflowDefinition");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteEnvelopeWorkflowDefinition");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/workflow"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
   * Deletes an envelope lock.
   * Deletes the lock from the specified envelope. The &#x60;X-DocuSign-Edit&#x60; header must be included in the request.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return LockInformation
   * @throws ApiException if fails to make API call
   */
  public LockInformation deleteLock(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteLock");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteLock");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/lock"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    GenericType<LockInformation> localVarReturnType = new GenericType<LockInformation>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Delete page information for Display Appliance
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @throws ApiException if fails to make API call
   */
  public void deletePageInfo(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deletePageInfo");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deletePageInfo");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/display_appliance_info/page_info/delete"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }

  /**
   * Deletes a recipient from an envelope.
   * Deletes the specified recipient file from the specified envelope. This cannot be used if the envelope has been sent.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @return Recipients
   * @throws ApiException if fails to make API call
   */
  public Recipients deleteRecipient(String accountId, String envelopeId, String recipientId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteRecipient");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteRecipient");
    }
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling deleteRecipient");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

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

    GenericType<Recipients> localVarReturnType = new GenericType<Recipients>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Delete RecipientDeniedDocumentCopy for Display Appliance
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteRecipientDeniedDocumentCopy(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteRecipientDeniedDocumentCopy");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteRecipientDeniedDocumentCopy");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/display_appliance_info/recipient_denied_copy"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
   * Deletes recipients from an envelope.
   * Deletes one or more recipients from a draft or sent envelope. Recipients to be deleted are listed in the request, with the &#x60;recipientId&#x60; being used as the key for deleting recipients.  If the envelope is &#x60;In Process&#x60;, meaning that it has been sent and has not  been completed or voided, recipients that have completed their actions cannot be deleted.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipients  (optional)
   * @return Recipients
   * @throws ApiException if fails to make API call
   */
  public Recipients deleteRecipients(String accountId, String envelopeId, Recipients recipients) throws ApiException {
    Object localVarPostBody = recipients;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteRecipients");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteRecipients");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/recipients"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    GenericType<Recipients> localVarReturnType = new GenericType<Recipients>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Delete signer attachment information for Display Appliance
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteSignerAttachment(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteSignerAttachment");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteSignerAttachment");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/display_appliance_info/signer_attachment_info"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
   * Deletes the tabs associated with a recipient.
   * Deletes one or more tabs associated with a recipient in a draft envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param tabs  (optional)
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public Tabs deleteTabs(String accountId, String envelopeId, String recipientId, Tabs tabs) throws ApiException {
    Object localVarPostBody = tabs;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteTabs");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteTabs");
    }
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling deleteTabs");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/tabs"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

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

    GenericType<Tabs> localVarReturnType = new GenericType<Tabs>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Delete the workflow definition for a template.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteTemplateWorkflowDefinition(String accountId, String templateId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteTemplateWorkflowDefinition");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling deleteTemplateWorkflowDefinition");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/workflow"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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
   * Deletes a template from a document in an existing envelope.
   * Deletes the specified template from a document in an existing envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteTemplatesFromDocument(String accountId, String envelopeId, String documentId, String templateId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteTemplatesFromDocument");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling deleteTemplatesFromDocument");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling deleteTemplatesFromDocument");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling deleteTemplatesFromDocument");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/templates/{templateId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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
   * Returns envelope account information for Display Appliance
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return DisplayApplianceAccount
   * @throws ApiException if fails to make API call
   */
  public DisplayApplianceAccount getAccount(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getAccount");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getAccount");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/display_appliance_info/account_info"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    GenericType<DisplayApplianceAccount> localVarReturnType = new GenericType<DisplayApplianceAccount>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Returns envelope and recipient information for Display Appliance
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return DisplayApplianceInfo
   * @throws ApiException if fails to make API call
   */
  public DisplayApplianceInfo getApplianceInfo(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getApplianceInfo");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getApplianceInfo");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/display_appliance_info"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    GenericType<DisplayApplianceInfo> localVarReturnType = new GenericType<DisplayApplianceInfo>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Retrieves an attachment from the envelope.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param attachmentId  (required)
   * @throws ApiException if fails to make API call
   */
  public void getAttachment(String accountId, String envelopeId, String attachmentId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getAttachment");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getAttachment");
    }
    
    // verify the required parameter 'attachmentId' is set
    if (attachmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'attachmentId' when calling getAttachment");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/attachments/{attachmentId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "attachmentId" + "\\}", apiClient.escapeString(attachmentId.toString()));

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
   * Returns a list of attachments associated with the specified envelope
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return EnvelopeAttachmentsResult
   * @throws ApiException if fails to make API call
   */
  public EnvelopeAttachmentsResult getAttachments(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getAttachments");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getAttachments");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/attachments"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    GenericType<EnvelopeAttachmentsResult> localVarReturnType = new GenericType<EnvelopeAttachmentsResult>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Retrieves the current metadata of a ChunkedUpload. 
  /// </summary>
  public class GetChunkedUploadOptions
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
   * Retrieves the current metadata of a ChunkedUpload.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param chunkedUploadId  (required)
   * @return ChunkedUploadResponse
   */ 
  public ChunkedUploadResponse getChunkedUpload(String accountId, String chunkedUploadId) throws ApiException {
    return getChunkedUpload(accountId, chunkedUploadId, null);
  }

  /**
   * Retrieves the current metadata of a ChunkedUpload.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param chunkedUploadId  (required)
   * @param options for modifying the method behavior.
   * @return ChunkedUploadResponse
   * @throws ApiException if fails to make API call
   */
  public ChunkedUploadResponse getChunkedUpload(String accountId, String chunkedUploadId, EnvelopesApi.GetChunkedUploadOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getChunkedUpload");
    }
    
    // verify the required parameter 'chunkedUploadId' is set
    if (chunkedUploadId == null) {
      throw new ApiException(400, "Missing the required parameter 'chunkedUploadId' when calling getChunkedUpload");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/chunked_uploads/{chunkedUploadId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "chunkedUploadId" + "\\}", apiClient.escapeString(chunkedUploadId.toString()));

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

    GenericType<ChunkedUploadResponse> localVarReturnType = new GenericType<ChunkedUploadResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Gets comment transcript for envelope and user 
  /// </summary>
  public class GetCommentsTranscriptOptions
  {
  private String encoding = null;
  /*
   * 
   */
  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }

  public String getEncoding() {
    return this.encoding;
  }
  }

   /**
   * Gets comment transcript for envelope and user
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return byte[]
   */ 
  public byte[] getCommentsTranscript(String accountId, String envelopeId) throws ApiException {
    return getCommentsTranscript(accountId, envelopeId, null);
  }

  /**
   * Gets comment transcript for envelope and user
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param options for modifying the method behavior.
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public byte[] getCommentsTranscript(String accountId, String envelopeId, EnvelopesApi.GetCommentsTranscriptOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getCommentsTranscript");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getCommentsTranscript");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/comments/transcript"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("encoding", options.encoding));
    }

    

    

    final String[] localVarAccepts = {
      "application/pdf"
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
  /// Reserved: Gets the Electronic Record and Signature Disclosure associated with the account. Reserved: Retrieves the Electronic Record and Signature Disclosure, with HTML formatting, associated with the account.
  /// </summary>
  public class GetConsumerDisclosureOptions
  {
  private String langCode2 = null;
  /*
   * 
   */
  public void setLangCode2(String langCode2) {
    this.langCode2 = langCode2;
  }

  public String getLangCode2() {
    return this.langCode2;
  }
  }

   /**
   * Reserved: Gets the Electronic Record and Signature Disclosure associated with the account.
   * Reserved: Retrieves the Electronic Record and Signature Disclosure, with HTML formatting, associated with the account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param langCode The simple type enumeration the language used in the response. The supported languages, with the language value shown in parenthesis, are:Arabic (ar), Armenian (hy), Bulgarian (bg), Czech (cs), Chinese Simplified (zh_CN), Chinese Traditional (zh_TW), Croatian (hr), Danish (da), Dutch (nl), English US (en), English UK (en_GB), Estonian (et), Farsi (fa), Finnish (fi), French (fr), French Canada (fr_CA), German (de), Greek (el), Hebrew (he), Hindi (hi), Hungarian (hu), Bahasa Indonesia (id), Italian (it), Japanese (ja), Korean (ko), Latvian (lv), Lithuanian (lt), Bahasa Melayu (ms), Norwegian (no), Polish (pl), Portuguese (pt), Portuguese Brazil (pt_BR), Romanian (ro), Russian (ru), Serbian (sr), Slovak (sk), Slovenian (sl), Spanish (es),Spanish Latin America (es_MX), Swedish (sv), Thai (th), Turkish (tr), Ukrainian (uk) and Vietnamese (vi). Additionally, the value can be set to Ã¯Â¿Â½browserÃ¯Â¿Â½ to automatically detect the browser language being used by the viewer and display the disclosure in that language. (required)
   * @return ConsumerDisclosure
   */ 
  public ConsumerDisclosure getConsumerDisclosure(String accountId, String envelopeId, String recipientId, String langCode) throws ApiException {
    return getConsumerDisclosure(accountId, envelopeId, recipientId, langCode, null);
  }

  /**
   * Reserved: Gets the Electronic Record and Signature Disclosure associated with the account.
   * Reserved: Retrieves the Electronic Record and Signature Disclosure, with HTML formatting, associated with the account.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param langCode The simple type enumeration the language used in the response. The supported languages, with the language value shown in parenthesis, are:Arabic (ar), Armenian (hy), Bulgarian (bg), Czech (cs), Chinese Simplified (zh_CN), Chinese Traditional (zh_TW), Croatian (hr), Danish (da), Dutch (nl), English US (en), English UK (en_GB), Estonian (et), Farsi (fa), Finnish (fi), French (fr), French Canada (fr_CA), German (de), Greek (el), Hebrew (he), Hindi (hi), Hungarian (hu), Bahasa Indonesia (id), Italian (it), Japanese (ja), Korean (ko), Latvian (lv), Lithuanian (lt), Bahasa Melayu (ms), Norwegian (no), Polish (pl), Portuguese (pt), Portuguese Brazil (pt_BR), Romanian (ro), Russian (ru), Serbian (sr), Slovak (sk), Slovenian (sl), Spanish (es),Spanish Latin America (es_MX), Swedish (sv), Thai (th), Turkish (tr), Ukrainian (uk) and Vietnamese (vi). Additionally, the value can be set to Ã¯Â¿Â½browserÃ¯Â¿Â½ to automatically detect the browser language being used by the viewer and display the disclosure in that language. (required)
   * @param options for modifying the method behavior.
   * @return ConsumerDisclosure
   * @throws ApiException if fails to make API call
   */
  public ConsumerDisclosure getConsumerDisclosure(String accountId, String envelopeId, String recipientId, String langCode, EnvelopesApi.GetConsumerDisclosureOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getConsumerDisclosure");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getConsumerDisclosure");
    }
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling getConsumerDisclosure");
    }
    
    // verify the required parameter 'langCode' is set
    if (langCode == null) {
      throw new ApiException(400, "Missing the required parameter 'langCode' when calling getConsumerDisclosure");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/consumer_disclosure/{langCode}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()))
      .replaceAll("\\{" + "langCode" + "\\}", apiClient.escapeString(langCode.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("langCode", options.langCode2));
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
  /// <summary>
  /// Gets the Electronic Record and Signature Disclosure associated with the account. Retrieves the Electronic Record and Signature Disclosure, with html formatting, associated with the account. You can use an optional query string to set the language for the disclosure.
  /// </summary>
  public class GetConsumerDisclosureDefaultOptions
  {
  private String langCode = null;
  /*
   * 
   */
  public void setLangCode(String langCode) {
    this.langCode = langCode;
  }

  public String getLangCode() {
    return this.langCode;
  }
  }

   /**
   * Gets the Electronic Record and Signature Disclosure associated with the account.
   * Retrieves the Electronic Record and Signature Disclosure, with html formatting, associated with the account. You can use an optional query string to set the language for the disclosure.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @return ConsumerDisclosure
   */ 
  public ConsumerDisclosure getConsumerDisclosureDefault(String accountId, String envelopeId, String recipientId) throws ApiException {
    return getConsumerDisclosureDefault(accountId, envelopeId, recipientId, null);
  }

  /**
   * Gets the Electronic Record and Signature Disclosure associated with the account.
   * Retrieves the Electronic Record and Signature Disclosure, with html formatting, associated with the account. You can use an optional query string to set the language for the disclosure.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param options for modifying the method behavior.
   * @return ConsumerDisclosure
   * @throws ApiException if fails to make API call
   */
  public ConsumerDisclosure getConsumerDisclosureDefault(String accountId, String envelopeId, String recipientId, EnvelopesApi.GetConsumerDisclosureDefaultOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getConsumerDisclosureDefault");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getConsumerDisclosureDefault");
    }
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling getConsumerDisclosureDefault");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/consumer_disclosure"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

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
   * Return custom fields information for Display Appliance
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return DisplayApplianceInfo
   * @throws ApiException if fails to make API call
   */
  public DisplayApplianceInfo getCustomFields(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getCustomFields");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/display_appliance_info/custom_fields"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    GenericType<DisplayApplianceInfo> localVarReturnType = new GenericType<DisplayApplianceInfo>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Gets date signed information for Display Appliance
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return DisplayApplianceInfo
   * @throws ApiException if fails to make API call
   */
  public DisplayApplianceInfo getDateSigned(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getDateSigned");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getDateSigned");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/display_appliance_info/date_signed"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    GenericType<DisplayApplianceInfo> localVarReturnType = new GenericType<DisplayApplianceInfo>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Gets a document from an envelope. Retrieves the specified document from the envelope. If the account has the Highlight Data Changes feature enabled, there is an option to request that any changes in the envelope be highlighted.  You can also use this method to retrieve a PDF containing the combined content of all documents and the certificate. If the account has the Highlight Data Changes feature enabled, there is an option to request that any changes in the envelope be highlighted.   To retrieve the combined content replace the &#x60;{documentId}&#x60; parameter in the endpoint with &#x60;combined&#x60;. /accounts/{accountId}/envelopes/{envelopeId}/documents/combined
  /// </summary>
  public class GetDocumentOptions
  {
  private String certificate = null;
  private String documentsByUserid = null;
  private String encoding = null;
  private String encrypt = null;
  private String language = null;
  private String recipientId = null;
  private String sharedUserId = null;
  private String showChanges = null;
  private String watermark = null;
  /*
   * When set to **false**, the envelope signing certificate is removed from the download. 
   */
  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }

  public String getCertificate() {
    return this.certificate;
  }
  /*
   * 
   */
  public void setDocumentsByUserid(String documentsByUserid) {
    this.documentsByUserid = documentsByUserid;
  }

  public String getDocumentsByUserid() {
    return this.documentsByUserid;
  }
  /*
   * 
   */
  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }

  public String getEncoding() {
    return this.encoding;
  }
  /*
   * When set to **true**, the PDF bytes returned in the response are encrypted for all the key managers configured on your DocuSign account. The documents can be decrypted with the KeyManager Decrypt Document API. 
   */
  public void setEncrypt(String encrypt) {
    this.encrypt = encrypt;
  }

  public String getEncrypt() {
    return this.encrypt;
  }
  /*
   * Specifies the language for the Certificate of Completion in the response. The supported languages, with the language value shown in parenthesis, are: Chinese Simplified (zh_CN), , Chinese Traditional (zh_TW), Dutch (nl), English US (en), French (fr), German (de), Italian (it), Japanese (ja), Korean (ko), Portuguese (pt), Portuguese (Brazil) (pt_BR), Russian (ru), Spanish (es).  
   */
  public void setLanguage(String language) {
    this.language = language;
  }

  public String getLanguage() {
    return this.language;
  }
  /*
   * 
   */
  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }

  public String getRecipientId() {
    return this.recipientId;
  }
  /*
   * 
   */
  public void setSharedUserId(String sharedUserId) {
    this.sharedUserId = sharedUserId;
  }

  public String getSharedUserId() {
    return this.sharedUserId;
  }
  /*
   * When set to **true**, any changed fields for the returned PDF are highlighted in yellow and optional signatures or initials outlined in red.  
   */
  public void setShowChanges(String showChanges) {
    this.showChanges = showChanges;
  }

  public String getShowChanges() {
    return this.showChanges;
  }
  /*
   * When set to **true**, the account has the watermark feature enabled, and the envelope is not complete, the watermark for the account is added to the PDF documents. This option can remove the watermark.  
   */
  public void setWatermark(String watermark) {
    this.watermark = watermark;
  }

  public String getWatermark() {
    return this.watermark;
  }
  }

   /**
   * Gets a document from an envelope.
   * Retrieves the specified document from the envelope. If the account has the Highlight Data Changes feature enabled, there is an option to request that any changes in the envelope be highlighted.  You can also use this method to retrieve a PDF containing the combined content of all documents and the certificate. If the account has the Highlight Data Changes feature enabled, there is an option to request that any changes in the envelope be highlighted.   To retrieve the combined content replace the &#x60;{documentId}&#x60; parameter in the endpoint with &#x60;combined&#x60;. /accounts/{accountId}/envelopes/{envelopeId}/documents/combined
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @return byte[]
   */ 
  public byte[] getDocument(String accountId, String envelopeId, String documentId) throws ApiException {
    return getDocument(accountId, envelopeId, documentId, null);
  }

  /**
   * Gets a document from an envelope.
   * Retrieves the specified document from the envelope. If the account has the Highlight Data Changes feature enabled, there is an option to request that any changes in the envelope be highlighted.  You can also use this method to retrieve a PDF containing the combined content of all documents and the certificate. If the account has the Highlight Data Changes feature enabled, there is an option to request that any changes in the envelope be highlighted.   To retrieve the combined content replace the &#x60;{documentId}&#x60; parameter in the endpoint with &#x60;combined&#x60;. /accounts/{accountId}/envelopes/{envelopeId}/documents/combined
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param options for modifying the method behavior.
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public byte[] getDocument(String accountId, String envelopeId, String documentId, EnvelopesApi.GetDocumentOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getDocument");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getDocument");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling getDocument");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("certificate", options.certificate));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("documents_by_userid", options.documentsByUserid));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("encoding", options.encoding));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("encrypt", options.encrypt));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("language", options.language));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("recipient_id", options.recipientId));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("shared_user_id", options.sharedUserId));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("show_changes", options.showChanges));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("watermark", options.watermark));
    }

    

    

    final String[] localVarAccepts = {
      "application/pdf"
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
  /// Gets a page image from an envelope for display. Retrieves a page image for display from the specified envelope.
  /// </summary>
  public class GetDocumentPageImageOptions
  {
  private String dpi = null;
  private String maxHeight = null;
  private String maxWidth = null;
  private String showChanges = null;
  /*
   * Sets the dpi for the image. 
   */
  public void setDpi(String dpi) {
    this.dpi = dpi;
  }

  public String getDpi() {
    return this.dpi;
  }
  /*
   * Sets the maximum height for the page image in pixels. The dpi is recalculated based on this setting. 
   */
  public void setMaxHeight(String maxHeight) {
    this.maxHeight = maxHeight;
  }

  public String getMaxHeight() {
    return this.maxHeight;
  }
  /*
   * Sets the maximum width for the page image in pixels. The dpi is recalculated based on this setting. 
   */
  public void setMaxWidth(String maxWidth) {
    this.maxWidth = maxWidth;
  }

  public String getMaxWidth() {
    return this.maxWidth;
  }
  /*
   * 
   */
  public void setShowChanges(String showChanges) {
    this.showChanges = showChanges;
  }

  public String getShowChanges() {
    return this.showChanges;
  }
  }

   /**
   * Gets a page image from an envelope for display.
   * Retrieves a page image for display from the specified envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param pageNumber The page number being accessed. (required)
   * @return byte[]
   */ 
  public byte[] getDocumentPageImage(String accountId, String envelopeId, String documentId, String pageNumber) throws ApiException {
    return getDocumentPageImage(accountId, envelopeId, documentId, pageNumber, null);
  }

  /**
   * Gets a page image from an envelope for display.
   * Retrieves a page image for display from the specified envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param pageNumber The page number being accessed. (required)
   * @param options for modifying the method behavior.
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public byte[] getDocumentPageImage(String accountId, String envelopeId, String documentId, String pageNumber, EnvelopesApi.GetDocumentPageImageOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getDocumentPageImage");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getDocumentPageImage");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling getDocumentPageImage");
    }
    
    // verify the required parameter 'pageNumber' is set
    if (pageNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'pageNumber' when calling getDocumentPageImage");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/pages/{pageNumber}/page_image"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()))
      .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(pageNumber.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("dpi", options.dpi));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("max_height", options.maxHeight));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("max_width", options.maxWidth));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("show_changes", options.showChanges));
    }

    

    

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
   * Return document pages for Display Appliance
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return DisplayApplianceInfo
   * @throws ApiException if fails to make API call
   */
  public DisplayApplianceInfo getDocumentPages(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getDocumentPages");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getDocumentPages");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/display_appliance_info/document_page_list"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    GenericType<DisplayApplianceInfo> localVarReturnType = new GenericType<DisplayApplianceInfo>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Returns tabs on the document. 
  /// </summary>
  public class GetDocumentTabsOptions
  {
  private String includeMetadata = null;
  private String pageNumbers = null;
  /*
   * 
   */
  public void setIncludeMetadata(String includeMetadata) {
    this.includeMetadata = includeMetadata;
  }

  public String getIncludeMetadata() {
    return this.includeMetadata;
  }
  /*
   * 
   */
  public void setPageNumbers(String pageNumbers) {
    this.pageNumbers = pageNumbers;
  }

  public String getPageNumbers() {
    return this.pageNumbers;
  }
  }

   /**
   * Returns tabs on the document.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @return Tabs
   */ 
  public Tabs getDocumentTabs(String accountId, String envelopeId, String documentId) throws ApiException {
    return getDocumentTabs(accountId, envelopeId, documentId, null);
  }

  /**
   * Returns tabs on the document.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param options for modifying the method behavior.
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public Tabs getDocumentTabs(String accountId, String envelopeId, String documentId, EnvelopesApi.GetDocumentTabsOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getDocumentTabs");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getDocumentTabs");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling getDocumentTabs");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/tabs"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_metadata", options.includeMetadata));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("page_numbers", options.pageNumbers));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<Tabs> localVarReturnType = new GenericType<Tabs>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Return document pages for Display Appliance
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return DisplayApplianceInfo
   * @throws ApiException if fails to make API call
   */
  public DisplayApplianceInfo getDynamicSystemSettings(String accountId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getDynamicSystemSettings");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/display_appliance_info/dynamicsystemsettings"
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

    GenericType<DisplayApplianceInfo> localVarReturnType = new GenericType<DisplayApplianceInfo>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Gets the email setting overrides for an envelope.
   * Retrieves the email override settings for the specified envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return EmailSettings
   * @throws ApiException if fails to make API call
   */
  public EmailSettings getEmailSettings(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getEmailSettings");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getEmailSettings");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/email_settings"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    GenericType<EmailSettings> localVarReturnType = new GenericType<EmailSettings>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Gets the status of a envelope. Retrieves the overall status for the specified envelope.
  /// </summary>
  public class GetEnvelopeOptions
  {
  private String advancedUpdate = null;
  private String include = null;
  /*
   * When true, envelope information can be added or modified. 
   */
  public void setAdvancedUpdate(String advancedUpdate) {
    this.advancedUpdate = advancedUpdate;
  }

  public String getAdvancedUpdate() {
    return this.advancedUpdate;
  }
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
   * Gets the status of a envelope.
   * Retrieves the overall status for the specified envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return Envelope
   */ 
  public Envelope getEnvelope(String accountId, String envelopeId) throws ApiException {
    return getEnvelope(accountId, envelopeId, null);
  }

  /**
   * Gets the status of a envelope.
   * Retrieves the overall status for the specified envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param options for modifying the method behavior.
   * @return Envelope
   * @throws ApiException if fails to make API call
   */
  public Envelope getEnvelope(String accountId, String envelopeId, EnvelopesApi.GetEnvelopeOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getEnvelope");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getEnvelope");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("advanced_update", options.advancedUpdate));
    }if (options != null) {
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

    GenericType<Envelope> localVarReturnType = new GenericType<Envelope>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Get the Original HTML Definition used to generate the Responsive HTML for a given document.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @return DocumentHtmlDefinitionOriginals
   * @throws ApiException if fails to make API call
   */
  public DocumentHtmlDefinitionOriginals getEnvelopeDocumentHtmlDefinitions(String accountId, String envelopeId, String documentId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getEnvelopeDocumentHtmlDefinitions");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getEnvelopeDocumentHtmlDefinitions");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling getEnvelopeDocumentHtmlDefinitions");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/html_definitions"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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

    GenericType<DocumentHtmlDefinitionOriginals> localVarReturnType = new GenericType<DocumentHtmlDefinitionOriginals>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Get the Original HTML Definition used to generate the Responsive HTML for the envelope.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return DocumentHtmlDefinitionOriginals
   * @throws ApiException if fails to make API call
   */
  public DocumentHtmlDefinitionOriginals getEnvelopeHtmlDefinitions(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getEnvelopeHtmlDefinitions");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getEnvelopeHtmlDefinitions");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/html_definitions"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    GenericType<DocumentHtmlDefinitionOriginals> localVarReturnType = new GenericType<DocumentHtmlDefinitionOriginals>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Returns a list of envelope transfer rules in the specified account. 
  /// </summary>
  public class GetEnvelopeTransferRulesOptions
  {
  private String count = null;
  private String startPosition = null;
  /*
   * 
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
  public void setStartPosition(String startPosition) {
    this.startPosition = startPosition;
  }

  public String getStartPosition() {
    return this.startPosition;
  }
  }

   /**
   * Returns a list of envelope transfer rules in the specified account.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return EnvelopeTransferRuleInformation
   */ 
  public EnvelopeTransferRuleInformation getEnvelopeTransferRules(String accountId) throws ApiException {
    return getEnvelopeTransferRules(accountId, null);
  }

  /**
   * Returns a list of envelope transfer rules in the specified account.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return EnvelopeTransferRuleInformation
   * @throws ApiException if fails to make API call
   */
  public EnvelopeTransferRuleInformation getEnvelopeTransferRules(String accountId, EnvelopesApi.GetEnvelopeTransferRulesOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getEnvelopeTransferRules");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/transfer_rules"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("count", options.count));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("start_position", options.startPosition));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<EnvelopeTransferRuleInformation> localVarReturnType = new GenericType<EnvelopeTransferRuleInformation>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Returns the workflow definition for an envelope.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return Workflow
   * @throws ApiException if fails to make API call
   */
  public Workflow getEnvelopeWorkflowDefinition(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getEnvelopeWorkflowDefinition");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getEnvelopeWorkflowDefinition");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/workflow"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    GenericType<Workflow> localVarReturnType = new GenericType<Workflow>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Returns envelope form data for an existing envelope.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return EnvelopeFormData
   * @throws ApiException if fails to make API call
   */
  public EnvelopeFormData getFormData(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getFormData");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getFormData");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/form_data"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    GenericType<EnvelopeFormData> localVarReturnType = new GenericType<EnvelopeFormData>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Returns images for Display Appliance
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return DisplayApplianceInfo
   * @throws ApiException if fails to make API call
   */
  public DisplayApplianceInfo getImage(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getImage");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getImage");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/display_appliance_info/image"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    GenericType<DisplayApplianceInfo> localVarReturnType = new GenericType<DisplayApplianceInfo>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Returns locale policy information for Display Appliance
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param userId The user ID of the user being accessed. Generally this is the user ID of the authenticated user, but if the authenticated user is an Admin on the account, this may be another user the Admin user is accessing. (required)
   * @return DisplayApplianceInfo
   * @throws ApiException if fails to make API call
   */
  public DisplayApplianceInfo getLocalePolicy(String accountId, String envelopeId, String userId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getLocalePolicy");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getLocalePolicy");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getLocalePolicy");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/display_appliance_info/localepolicy/{userId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

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

    GenericType<DisplayApplianceInfo> localVarReturnType = new GenericType<DisplayApplianceInfo>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Gets envelope lock information.
   * Retrieves general information about the envelope lock.  If the call is made by the locked by user and the request has the same integrator key as original, then the &#x60;X-DocuSign-Edit&#x60; header and additional lock information is included in the response. This allows users to recover a lost editing session token and the &#x60;X-DocuSign-Edit&#x60; header.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return LockInformation
   * @throws ApiException if fails to make API call
   */
  public LockInformation getLock(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getLock");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getLock");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/lock"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    GenericType<LockInformation> localVarReturnType = new GenericType<LockInformation>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Gets envelope notification information.
   * Retrieves the envelope notification, reminders and expirations, information for an existing envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return Notification
   * @throws ApiException if fails to make API call
   */
  public Notification getNotificationSettings(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getNotificationSettings");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getNotificationSettings");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/notification"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    GenericType<Notification> localVarReturnType = new GenericType<Notification>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Returns tabs on the specified page.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param pageNumber The page number being accessed. (required)
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public Tabs getPageTabs(String accountId, String envelopeId, String documentId, String pageNumber) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getPageTabs");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getPageTabs");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling getPageTabs");
    }
    
    // verify the required parameter 'pageNumber' is set
    if (pageNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'pageNumber' when calling getPageTabs");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/pages/{pageNumber}/tabs"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()))
      .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(pageNumber.toString()));

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

    GenericType<Tabs> localVarReturnType = new GenericType<Tabs>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Returns document page image(s) based on input. 
  /// </summary>
  public class GetPagesOptions
  {
  private String count = null;
  private String dpi = null;
  private String maxHeight = null;
  private String maxWidth = null;
  private String nocache = null;
  private String showChanges = null;
  private String startPosition = null;
  /*
   * 
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
  public void setDpi(String dpi) {
    this.dpi = dpi;
  }

  public String getDpi() {
    return this.dpi;
  }
  /*
   * 
   */
  public void setMaxHeight(String maxHeight) {
    this.maxHeight = maxHeight;
  }

  public String getMaxHeight() {
    return this.maxHeight;
  }
  /*
   * 
   */
  public void setMaxWidth(String maxWidth) {
    this.maxWidth = maxWidth;
  }

  public String getMaxWidth() {
    return this.maxWidth;
  }
  /*
   * 
   */
  public void setNocache(String nocache) {
    this.nocache = nocache;
  }

  public String getNocache() {
    return this.nocache;
  }
  /*
   * 
   */
  public void setShowChanges(String showChanges) {
    this.showChanges = showChanges;
  }

  public String getShowChanges() {
    return this.showChanges;
  }
  /*
   * 
   */
  public void setStartPosition(String startPosition) {
    this.startPosition = startPosition;
  }

  public String getStartPosition() {
    return this.startPosition;
  }
  }

   /**
   * Returns document page image(s) based on input.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @return PageImages
   */ 
  public PageImages getPages(String accountId, String envelopeId, String documentId) throws ApiException {
    return getPages(accountId, envelopeId, documentId, null);
  }

  /**
   * Returns document page image(s) based on input.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param options for modifying the method behavior.
   * @return PageImages
   * @throws ApiException if fails to make API call
   */
  public PageImages getPages(String accountId, String envelopeId, String documentId, EnvelopesApi.GetPagesOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getPages");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getPages");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling getPages");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/pages"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("count", options.count));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("dpi", options.dpi));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("max_height", options.maxHeight));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("max_width", options.maxWidth));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("nocache", options.nocache));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("show_changes", options.showChanges));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("start_position", options.startPosition));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<PageImages> localVarReturnType = new GenericType<PageImages>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Return pdf for Display Appliance
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param pdfId  (required)
   * @return DisplayAppliancePdf
   * @throws ApiException if fails to make API call
   */
  public DisplayAppliancePdf getPdf(String accountId, String envelopeId, String pdfId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getPdf");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getPdf");
    }
    
    // verify the required parameter 'pdfId' is set
    if (pdfId == null) {
      throw new ApiException(400, "Missing the required parameter 'pdfId' when calling getPdf");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/display_appliance_info/pdf/{pdfId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "pdfId" + "\\}", apiClient.escapeString(pdfId.toString()));

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

    GenericType<DisplayAppliancePdf> localVarReturnType = new GenericType<DisplayAppliancePdf>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Return pdf blobs for Display Appliance
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return DisplayAppliancePdf
   * @throws ApiException if fails to make API call
   */
  public DisplayAppliancePdf getPdfBlob(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getPdfBlob");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getPdfBlob");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/display_appliance_info/pdf_blobs"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    GenericType<DisplayAppliancePdf> localVarReturnType = new GenericType<DisplayAppliancePdf>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Returns document visibility for the recipients
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @return DocumentVisibilityList
   * @throws ApiException if fails to make API call
   */
  public DocumentVisibilityList getRecipientDocumentVisibility(String accountId, String envelopeId, String recipientId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getRecipientDocumentVisibility");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getRecipientDocumentVisibility");
    }
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling getRecipientDocumentVisibility");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/document_visibility"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

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

    GenericType<DocumentVisibilityList> localVarReturnType = new GenericType<DocumentVisibilityList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Gets the initials image for a user. Retrieves the initials image for the specified user. The image is returned in the same format as it was uploaded. In the request you can specify if the chrome (the added line and identifier around the initial image) is returned with the image.  The userId specified in the endpoint must match the authenticated user&#39;s user id and the user must be a member of the account.  The &#x60;signatureIdOrName&#x60; paramter accepts signature ID or signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that do not properly URL encode. If you use the user name, it is likely that the name includes spaces and you might need to URL encode the name before using it in the endpoint.   For example: \&quot;Bob Smith\&quot; to \&quot;Bob%20Smith\&quot;  Older envelopes might only contain chromed images. If getting the non-chromed image fails, try getting the chromed image.
  /// </summary>
  public class GetRecipientInitialsImageOptions
  {
  private String includeChrome = null;
  /*
   * The added line and identifier around the initial image. Note: Older envelopes might only have chromed images. If getting the non-chromed image fails, try getting the chromed image. 
   */
  public void setIncludeChrome(String includeChrome) {
    this.includeChrome = includeChrome;
  }

  public String getIncludeChrome() {
    return this.includeChrome;
  }
  }

   /**
   * Gets the initials image for a user.
   * Retrieves the initials image for the specified user. The image is returned in the same format as it was uploaded. In the request you can specify if the chrome (the added line and identifier around the initial image) is returned with the image.  The userId specified in the endpoint must match the authenticated user&#39;s user id and the user must be a member of the account.  The &#x60;signatureIdOrName&#x60; paramter accepts signature ID or signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that do not properly URL encode. If you use the user name, it is likely that the name includes spaces and you might need to URL encode the name before using it in the endpoint.   For example: \&quot;Bob Smith\&quot; to \&quot;Bob%20Smith\&quot;  Older envelopes might only contain chromed images. If getting the non-chromed image fails, try getting the chromed image.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @return byte[]
   */ 
  public byte[] getRecipientInitialsImage(String accountId, String envelopeId, String recipientId) throws ApiException {
    return getRecipientInitialsImage(accountId, envelopeId, recipientId, null);
  }

  /**
   * Gets the initials image for a user.
   * Retrieves the initials image for the specified user. The image is returned in the same format as it was uploaded. In the request you can specify if the chrome (the added line and identifier around the initial image) is returned with the image.  The userId specified in the endpoint must match the authenticated user&#39;s user id and the user must be a member of the account.  The &#x60;signatureIdOrName&#x60; paramter accepts signature ID or signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that do not properly URL encode. If you use the user name, it is likely that the name includes spaces and you might need to URL encode the name before using it in the endpoint.   For example: \&quot;Bob Smith\&quot; to \&quot;Bob%20Smith\&quot;  Older envelopes might only contain chromed images. If getting the non-chromed image fails, try getting the chromed image.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param options for modifying the method behavior.
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public byte[] getRecipientInitialsImage(String accountId, String envelopeId, String recipientId, EnvelopesApi.GetRecipientInitialsImageOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getRecipientInitialsImage");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getRecipientInitialsImage");
    }
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling getRecipientInitialsImage");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/initials_image"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

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

  /**
   * Gets signature information for a signer or sign-in-person recipient.
   * Retrieves signature information for a signer or sign-in-person recipient.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @return UserSignature
   * @throws ApiException if fails to make API call
   */
  public UserSignature getRecipientSignature(String accountId, String envelopeId, String recipientId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getRecipientSignature");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getRecipientSignature");
    }
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling getRecipientSignature");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/signature"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

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

    GenericType<UserSignature> localVarReturnType = new GenericType<UserSignature>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Retrieve signature image information for a signer/sign-in-person recipient. Retrieves the specified user signature image. The image is returned in the same format as uploaded. In the request you can specify if the chrome (the added line and identifier around the initial image) is returned with the image.  The userId specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.  The &#x60;signatureIdOrName&#x60; parameter accepts signature ID or signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that don&#39;t properly URL encode. If you use the user name, it is likely that the name includes spaces and you might need to URL encode the name before using it in the endpoint.   For example: \&quot;Bob Smith\&quot; to \&quot;Bob%20Smith\&quot;  Older envelopes might only have chromed images. If getting the non-chromed image fails, try getting the chromed image.
  /// </summary>
  public class GetRecipientSignatureImageOptions
  {
  private String includeChrome = null;
  /*
   * When set to **true**, indicates the chromed version of the signature image should be retrieved. 
   */
  public void setIncludeChrome(String includeChrome) {
    this.includeChrome = includeChrome;
  }

  public String getIncludeChrome() {
    return this.includeChrome;
  }
  }

   /**
   * Retrieve signature image information for a signer/sign-in-person recipient.
   * Retrieves the specified user signature image. The image is returned in the same format as uploaded. In the request you can specify if the chrome (the added line and identifier around the initial image) is returned with the image.  The userId specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.  The &#x60;signatureIdOrName&#x60; parameter accepts signature ID or signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that don&#39;t properly URL encode. If you use the user name, it is likely that the name includes spaces and you might need to URL encode the name before using it in the endpoint.   For example: \&quot;Bob Smith\&quot; to \&quot;Bob%20Smith\&quot;  Older envelopes might only have chromed images. If getting the non-chromed image fails, try getting the chromed image.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @return byte[]
   */ 
  public byte[] getRecipientSignatureImage(String accountId, String envelopeId, String recipientId) throws ApiException {
    return getRecipientSignatureImage(accountId, envelopeId, recipientId, null);
  }

  /**
   * Retrieve signature image information for a signer/sign-in-person recipient.
   * Retrieves the specified user signature image. The image is returned in the same format as uploaded. In the request you can specify if the chrome (the added line and identifier around the initial image) is returned with the image.  The userId specified in the endpoint must match the authenticated user&#39;s user ID and the user must be a member of the account.  The &#x60;signatureIdOrName&#x60; parameter accepts signature ID or signature name. DocuSign recommends you use signature ID (&#x60;signatureId&#x60;), since some names contain characters that don&#39;t properly URL encode. If you use the user name, it is likely that the name includes spaces and you might need to URL encode the name before using it in the endpoint.   For example: \&quot;Bob Smith\&quot; to \&quot;Bob%20Smith\&quot;  Older envelopes might only have chromed images. If getting the non-chromed image fails, try getting the chromed image.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param options for modifying the method behavior.
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public byte[] getRecipientSignatureImage(String accountId, String envelopeId, String recipientId, EnvelopesApi.GetRecipientSignatureImageOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getRecipientSignatureImage");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getRecipientSignatureImage");
    }
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling getRecipientSignatureImage");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/signature_image"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

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

  /**
   * Return signer attachment information for Display Appliance
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return DisplayApplianceSignerAttachment
   * @throws ApiException if fails to make API call
   */
  public DisplayApplianceSignerAttachment getSignerAttachment(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getSignerAttachment");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getSignerAttachment");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/display_appliance_info/signer_attachment_info"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    GenericType<DisplayApplianceSignerAttachment> localVarReturnType = new GenericType<DisplayApplianceSignerAttachment>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Get encrypted tabs for envelope.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @throws ApiException if fails to make API call
   */
  public void getTabsBlob(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getTabsBlob");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling getTabsBlob");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/tabs_blob"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
   * Returns if template was encrypted by Display Appliance
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @return DisplayApplianceInfo
   * @throws ApiException if fails to make API call
   */
  public DisplayApplianceInfo getTemplateInfo(String accountId, String templateId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getTemplateInfo");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling getTemplateInfo");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{templateId}/display_appliance_info/templateInfo"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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

    GenericType<DisplayApplianceInfo> localVarReturnType = new GenericType<DisplayApplianceInfo>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Returns document visibility for the recipients
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @return DocumentVisibilityList
   * @throws ApiException if fails to make API call
   */
  public DocumentVisibilityList getTemplateRecipientDocumentVisibility(String accountId, String templateId, String recipientId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getTemplateRecipientDocumentVisibility");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling getTemplateRecipientDocumentVisibility");
    }
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling getTemplateRecipientDocumentVisibility");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/recipients/{recipientId}/document_visibility"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

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

    GenericType<DocumentVisibilityList> localVarReturnType = new GenericType<DocumentVisibilityList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Returns the workflow definition for a template.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @return Workflow
   * @throws ApiException if fails to make API call
   */
  public Workflow getTemplateWorkflowDefinition(String accountId, String templateId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getTemplateWorkflowDefinition");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling getTemplateWorkflowDefinition");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/workflow"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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

    GenericType<Workflow> localVarReturnType = new GenericType<Workflow>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Gets the envelope audit events for an envelope.
   * Gets the envelope audit events for the specified envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return EnvelopeAuditEventResponse
   * @throws ApiException if fails to make API call
   */
  public EnvelopeAuditEventResponse listAuditEvents(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listAuditEvents");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling listAuditEvents");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/audit_events"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    GenericType<EnvelopeAuditEventResponse> localVarReturnType = new GenericType<EnvelopeAuditEventResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Gets the custom field information for the specified envelope.
   * Retrieves the custom field information for the specified envelope. You can use these fields in the envelopes for your account to record information about the envelope, help search for envelopes, and track information. The envelope custom fields are shown in the Envelope Settings section when a user is creating an envelope in the DocuSign member console. The envelope custom fields are not seen by the envelope recipients.  There are two types of envelope custom fields, text, and list. A text custom field lets the sender enter the value for the field. With a list custom field, the sender selects the value of the field from a pre-made list.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return CustomFieldsEnvelope
   * @throws ApiException if fails to make API call
   */
  public CustomFieldsEnvelope listCustomFields(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listCustomFields");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling listCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/custom_fields"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    GenericType<CustomFieldsEnvelope> localVarReturnType = new GenericType<CustomFieldsEnvelope>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Gets the custom document fields from an  existing envelope document.
   * Retrieves the custom document field information from an existing envelope document.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @return DocumentFieldsInformation
   * @throws ApiException if fails to make API call
   */
  public DocumentFieldsInformation listDocumentFields(String accountId, String envelopeId, String documentId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listDocumentFields");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling listDocumentFields");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling listDocumentFields");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/fields"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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

    GenericType<DocumentFieldsInformation> localVarReturnType = new GenericType<DocumentFieldsInformation>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Gets a list of envelope documents. Retrieves a list of documents associated with the specified envelope.
  /// </summary>
  public class ListDocumentsOptions
  {
  private String documentsByUserid = null;
  private String includeDocumentSize = null;
  private String includeMetadata = null;
  private String includeTabs = null;
  private String recipientId = null;
  private String sharedUserId = null;
  /*
   * 
   */
  public void setDocumentsByUserid(String documentsByUserid) {
    this.documentsByUserid = documentsByUserid;
  }

  public String getDocumentsByUserid() {
    return this.documentsByUserid;
  }
  /*
   * 
   */
  public void setIncludeDocumentSize(String includeDocumentSize) {
    this.includeDocumentSize = includeDocumentSize;
  }

  public String getIncludeDocumentSize() {
    return this.includeDocumentSize;
  }
  /*
   * 
   */
  public void setIncludeMetadata(String includeMetadata) {
    this.includeMetadata = includeMetadata;
  }

  public String getIncludeMetadata() {
    return this.includeMetadata;
  }
  /*
   * 
   */
  public void setIncludeTabs(String includeTabs) {
    this.includeTabs = includeTabs;
  }

  public String getIncludeTabs() {
    return this.includeTabs;
  }
  /*
   * 
   */
  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }

  public String getRecipientId() {
    return this.recipientId;
  }
  /*
   * 
   */
  public void setSharedUserId(String sharedUserId) {
    this.sharedUserId = sharedUserId;
  }

  public String getSharedUserId() {
    return this.sharedUserId;
  }
  }

   /**
   * Gets a list of envelope documents.
   * Retrieves a list of documents associated with the specified envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return EnvelopeDocumentsResult
   */ 
  public EnvelopeDocumentsResult listDocuments(String accountId, String envelopeId) throws ApiException {
    return listDocuments(accountId, envelopeId, null);
  }

  /**
   * Gets a list of envelope documents.
   * Retrieves a list of documents associated with the specified envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param options for modifying the method behavior.
   * @return EnvelopeDocumentsResult
   * @throws ApiException if fails to make API call
   */
  public EnvelopeDocumentsResult listDocuments(String accountId, String envelopeId, EnvelopesApi.ListDocumentsOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listDocuments");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling listDocuments");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("documents_by_userid", options.documentsByUserid));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_document_size", options.includeDocumentSize));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_metadata", options.includeMetadata));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_tabs", options.includeTabs));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("recipient_id", options.recipientId));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("shared_user_id", options.sharedUserId));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<EnvelopeDocumentsResult> localVarReturnType = new GenericType<EnvelopeDocumentsResult>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Gets the status of recipients for an envelope. Retrieves the status of all recipients in a single envelope and identifies the current recipient in the routing list.   The &#x60;currentRoutingOrder&#x60; property of the response contains the &#x60;routingOrder&#x60; value of the current recipient indicating that the envelope has been sent to the recipient, but the recipient has not completed their actions.
  /// </summary>
  public class ListRecipientsOptions
  {
  private String includeAnchorTabLocations = null;
  private String includeExtended = null;
  private String includeMetadata = null;
  private String includeTabs = null;
  /*
   *  When set to **true** and &#x60;include_tabs&#x60; is set to **true**, all tabs with anchor tab properties are included in the response.  
   */
  public void setIncludeAnchorTabLocations(String includeAnchorTabLocations) {
    this.includeAnchorTabLocations = includeAnchorTabLocations;
  }

  public String getIncludeAnchorTabLocations() {
    return this.includeAnchorTabLocations;
  }
  /*
   *  When set to **true**, the extended properties are included in the response.  
   */
  public void setIncludeExtended(String includeExtended) {
    this.includeExtended = includeExtended;
  }

  public String getIncludeExtended() {
    return this.includeExtended;
  }
  /*
   * 
   */
  public void setIncludeMetadata(String includeMetadata) {
    this.includeMetadata = includeMetadata;
  }

  public String getIncludeMetadata() {
    return this.includeMetadata;
  }
  /*
   * When set to **true**, the tab information associated with the recipient is included in the response. 
   */
  public void setIncludeTabs(String includeTabs) {
    this.includeTabs = includeTabs;
  }

  public String getIncludeTabs() {
    return this.includeTabs;
  }
  }

   /**
   * Gets the status of recipients for an envelope.
   * Retrieves the status of all recipients in a single envelope and identifies the current recipient in the routing list.   The &#x60;currentRoutingOrder&#x60; property of the response contains the &#x60;routingOrder&#x60; value of the current recipient indicating that the envelope has been sent to the recipient, but the recipient has not completed their actions.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return Recipients
   */ 
  public Recipients listRecipients(String accountId, String envelopeId) throws ApiException {
    return listRecipients(accountId, envelopeId, null);
  }

  /**
   * Gets the status of recipients for an envelope.
   * Retrieves the status of all recipients in a single envelope and identifies the current recipient in the routing list.   The &#x60;currentRoutingOrder&#x60; property of the response contains the &#x60;routingOrder&#x60; value of the current recipient indicating that the envelope has been sent to the recipient, but the recipient has not completed their actions.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param options for modifying the method behavior.
   * @return Recipients
   * @throws ApiException if fails to make API call
   */
  public Recipients listRecipients(String accountId, String envelopeId, EnvelopesApi.ListRecipientsOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listRecipients");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling listRecipients");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/recipients"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_anchor_tab_locations", options.includeAnchorTabLocations));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_extended", options.includeExtended));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_metadata", options.includeMetadata));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_tabs", options.includeTabs));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<Recipients> localVarReturnType = new GenericType<Recipients>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Gets the envelope status for the specified envelopes. Retrieves the envelope status for the specified envelopes.
  /// </summary>
  public class ListStatusOptions
  {
  private String acStatus = null;
  private String block = null;
  private String count = null;
  private String email = null;
  private String envelopeIds = null;
  private String fromDate = null;
  private String fromToStatus = null;
  private String startPosition = null;
  private String status = null;
  private String toDate = null;
  private String transactionIds = null;
  private String userName = null;
  /*
   * 
   */
  public void setAcStatus(String acStatus) {
    this.acStatus = acStatus;
  }

  public String getAcStatus() {
    return this.acStatus;
  }
  /*
   * 
   */
  public void setBlock(String block) {
    this.block = block;
  }

  public String getBlock() {
    return this.block;
  }
  /*
   * 
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
  public void setEmail(String email) {
    this.email = email;
  }

  public String getEmail() {
    return this.email;
  }
  /*
   * 
   */
  public void setEnvelopeIds(String envelopeIds) {
    this.envelopeIds = envelopeIds;
  }

  public String getEnvelopeIds() {
    return this.envelopeIds;
  }
  /*
   * 
   */
  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }

  public String getFromDate() {
    return this.fromDate;
  }
  /*
   * 
   */
  public void setFromToStatus(String fromToStatus) {
    this.fromToStatus = fromToStatus;
  }

  public String getFromToStatus() {
    return this.fromToStatus;
  }
  /*
   * 
   */
  public void setStartPosition(String startPosition) {
    this.startPosition = startPosition;
  }

  public String getStartPosition() {
    return this.startPosition;
  }
  /*
   * 
   */
  public void setStatus(String status) {
    this.status = status;
  }

  public String getStatus() {
    return this.status;
  }
  /*
   * 
   */
  public void setToDate(String toDate) {
    this.toDate = toDate;
  }

  public String getToDate() {
    return this.toDate;
  }
  /*
   * 
   */
  public void setTransactionIds(String transactionIds) {
    this.transactionIds = transactionIds;
  }

  public String getTransactionIds() {
    return this.transactionIds;
  }
  /*
   * 
   */
  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getUserName() {
    return this.userName;
  }
  }

   /**
   * Gets the envelope status for the specified envelopes.
   * Retrieves the envelope status for the specified envelopes.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeIdsRequest  (optional)
   * @return EnvelopesInformation
   */ 
  public EnvelopesInformation listStatus(String accountId, EnvelopeIdsRequest envelopeIdsRequest) throws ApiException {
    return listStatus(accountId, envelopeIdsRequest, null);
  }

  /**
   * Gets the envelope status for the specified envelopes.
   * Retrieves the envelope status for the specified envelopes.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeIdsRequest  (optional)
   * @param options for modifying the method behavior.
   * @return EnvelopesInformation
   * @throws ApiException if fails to make API call
   */
  public EnvelopesInformation listStatus(String accountId, EnvelopeIdsRequest envelopeIdsRequest, EnvelopesApi.ListStatusOptions options) throws ApiException {
    Object localVarPostBody = envelopeIdsRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listStatus");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/status"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("ac_status", options.acStatus));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("block", options.block));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("count", options.count));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("email", options.email));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("envelope_ids", options.envelopeIds));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("from_date", options.fromDate));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("from_to_status", options.fromToStatus));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("start_position", options.startPosition));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("status", options.status));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("to_date", options.toDate));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("transaction_ids", options.transactionIds));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("user_name", options.userName));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<EnvelopesInformation> localVarReturnType = new GenericType<EnvelopesInformation>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Gets status changes for one or more envelopes. Retrieves envelope status changes for all envelopes. You can modify the information returned by adding query strings to limit the request to check between certain dates and times, or for certain envelopes, or for certain status codes. It is recommended that you use one or more of the query strings in order to limit the size of the response.  ### Important: Unless you are requesting the status for specific envelopes (using the &#x60;envelopeIds&#x60; or &#x60;transactionIds&#x60; properties), you must add a set the &#x60;from_date&#x60; property in the request.  Getting envelope status using &#x60;transactionIds&#x60; is useful for offline signing situations where it can be used determine if an envelope was created or not, for the cases where a network connection was lost, before the envelope status could be returned.  ### Request Envelope Status Notes ###  The REST API GET /envelopes call uses certain filters to find results. In some cases requests are check for \&quot;any status change\&quot; instead of the just the single status requested. In these cases, more envelopes might be returned by the request than otherwise would be. For example, for a request with the begin date is set to Jan 1st, an end date set to Jan 7th and the status qualifier (&#x60;from_to_status&#x60;) set to &#x60;Delivered&#x60; &amp;mdash; the response set might contain envelopes that were created during that time period, but not delivered during the time period.  To avoid unnecessary database queries, the DocuSign system checks requests to ensure that the added filters will not result in a zero-size response before acting on the request. The following table shows the valid envelope statuses (in the Valid Current Statuses column) for the status qualifiers in the request. If the status and status qualifiers in the API request do not contain any of the values shown in the valid current statuses column, then an empty list is returned.  For example, a request with a status qualifier (from_to_status) of &#x60;Delivered&#x60; and a status of \&quot;&#x60;Created&#x60;,&#x60;Sent&#x60;\&quot;, DocuSign will always return an empty list. This is because the request essentially translates to: find the envelopes that were delivered between the begin and end dates that have a current status of &#x60;Created&#x60; or &#x60;Sent&#x60;, and since an envelope that has been delivered can never have a status of &#x60;Created&#x60; or &#x60;Sent&#x60;, a zero-size response would be generated. In this case, DocuSign does not run the request, but just returns the empty list.  Client applications should check that the statuses they are requesting make sense for a given status qualifier.
  /// </summary>
  public class ListStatusChangesOptions
  {
  private String acStatus = null;
  private String block = null;
  private String cdseMode = null;
  private String continuationToken = null;
  private String count = null;
  private String customField = null;
  private String email = null;
  private String envelopeIds = null;
  private String exclude = null;
  private String folderIds = null;
  private String folderTypes = null;
  private String fromDate = null;
  private String fromToStatus = null;
  private String include = null;
  private String includePurgeInformation = null;
  private String intersectingFolderIds = null;
  private String lastQueriedDate = null;
  private String order = null;
  private String orderBy = null;
  private String powerformids = null;
  private String queryBudget = null;
  private String requesterDateFormat = null;
  private String searchText = null;
  private String startPosition = null;
  private String status = null;
  private String toDate = null;
  private String transactionIds = null;
  private String userFilter = null;
  private String userId = null;
  private String userName = null;
  /*
   * Specifies the Authoritative Copy Status for the envelopes. The possible values are: Unknown, Original, Transferred, AuthoritativeCopy, AuthoritativeCopyExportPending, AuthoritativeCopyExported, DepositPending, Deposited, DepositedEO, or DepositFailed. 
   */
  public void setAcStatus(String acStatus) {
    this.acStatus = acStatus;
  }

  public String getAcStatus() {
    return this.acStatus;
  }
  /*
   * 
   */
  public void setBlock(String block) {
    this.block = block;
  }

  public String getBlock() {
    return this.block;
  }
  /*
   * 
   */
  public void setCdseMode(String cdseMode) {
    this.cdseMode = cdseMode;
  }

  public String getCdseMode() {
    return this.cdseMode;
  }
  /*
   * 
   */
  public void setContinuationToken(String continuationToken) {
    this.continuationToken = continuationToken;
  }

  public String getContinuationToken() {
    return this.continuationToken;
  }
  /*
   * 
   */
  public void setCount(String count) {
    this.count = count;
  }

  public String getCount() {
    return this.count;
  }
  /*
   * This specifies the envelope custom field name and value searched for in the envelope information. The value portion of the query can use partial strings by adding &#39;%&#39; (percent sign) around the custom field query value.   Example 1: If you have an envelope custom field called \&quot;Region\&quot; and you want to search for all envelopes where the value is \&quot;West\&quot; you would use the query: &#x60;?custom_field&#x3D;Region&#x3D;West&#x60;.   Example 2: To search for envelopes where the &#x60;ApplicationID&#x60; custom field has the value or partial value of \&quot;DocuSign\&quot; in field, the query would be: &#x60;?custom_field&#x3D;ApplicationId&#x3D;%DocuSign%&#x60; This would find envelopes where the custom field value is \&quot;DocuSign for Salesforce\&quot; or \&quot;DocuSign envelope.\&quot;   
   */
  public void setCustomField(String customField) {
    this.customField = customField;
  }

  public String getCustomField() {
    return this.customField;
  }
  /*
   * 
   */
  public void setEmail(String email) {
    this.email = email;
  }

  public String getEmail() {
    return this.email;
  }
  /*
   * 
   */
  public void setEnvelopeIds(String envelopeIds) {
    this.envelopeIds = envelopeIds;
  }

  public String getEnvelopeIds() {
    return this.envelopeIds;
  }
  /*
   * 
   */
  public void setExclude(String exclude) {
    this.exclude = exclude;
  }

  public String getExclude() {
    return this.exclude;
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
   * 
   */
  public void setFolderTypes(String folderTypes) {
    this.folderTypes = folderTypes;
  }

  public String getFolderTypes() {
    return this.folderTypes;
  }
  /*
   * The date/time setting that specifies the date/time when the request begins checking for status changes for envelopes in the account.  This is required unless &#39;envelopeId&#39;s are used. 
   */
  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }

  public String getFromDate() {
    return this.fromDate;
  }
  /*
   * This is the status type checked for in the &#x60;from_date&#x60;/&#x60;to_date&#x60; period. If &#x60;changed&#x60; is specified, then envelopes that changed status during the period are found. If for example, &#x60;created&#x60; is specified, then envelopes created during the period are found. Default is &#x60;changed&#x60;.   Possible values are: Voided, Changed, Created, Deleted, Sent, Delivered, Signed, Completed, Declined, TimedOut and Processing. 
   */
  public void setFromToStatus(String fromToStatus) {
    this.fromToStatus = fromToStatus;
  }

  public String getFromToStatus() {
    return this.fromToStatus;
  }
  /*
   * 
   */
  public void setInclude(String include) {
    this.include = include;
  }

  public String getInclude() {
    return this.include;
  }
  /*
   * 
   */
  public void setIncludePurgeInformation(String includePurgeInformation) {
    this.includePurgeInformation = includePurgeInformation;
  }

  public String getIncludePurgeInformation() {
    return this.includePurgeInformation;
  }
  /*
   * 
   */
  public void setIntersectingFolderIds(String intersectingFolderIds) {
    this.intersectingFolderIds = intersectingFolderIds;
  }

  public String getIntersectingFolderIds() {
    return this.intersectingFolderIds;
  }
  /*
   * 
   */
  public void setLastQueriedDate(String lastQueriedDate) {
    this.lastQueriedDate = lastQueriedDate;
  }

  public String getLastQueriedDate() {
    return this.lastQueriedDate;
  }
  /*
   * 
   */
  public void setOrder(String order) {
    this.order = order;
  }

  public String getOrder() {
    return this.order;
  }
  /*
   * 
   */
  public void setOrderBy(String orderBy) {
    this.orderBy = orderBy;
  }

  public String getOrderBy() {
    return this.orderBy;
  }
  /*
   * 
   */
  public void setPowerformids(String powerformids) {
    this.powerformids = powerformids;
  }

  public String getPowerformids() {
    return this.powerformids;
  }
  /*
   * 
   */
  public void setQueryBudget(String queryBudget) {
    this.queryBudget = queryBudget;
  }

  public String getQueryBudget() {
    return this.queryBudget;
  }
  /*
   * 
   */
  public void setRequesterDateFormat(String requesterDateFormat) {
    this.requesterDateFormat = requesterDateFormat;
  }

  public String getRequesterDateFormat() {
    return this.requesterDateFormat;
  }
  /*
   * 
   */
  public void setSearchText(String searchText) {
    this.searchText = searchText;
  }

  public String getSearchText() {
    return this.searchText;
  }
  /*
   * 
   */
  public void setStartPosition(String startPosition) {
    this.startPosition = startPosition;
  }

  public String getStartPosition() {
    return this.startPosition;
  }
  /*
   * The list of current statuses to include in the response. By default, all envelopes found are returned. If values are specified, then of the envelopes found, only those with the current status specified are returned in the results.   Possible values are: Voided, Created, Deleted, Sent, Delivered, Signed, Completed, Declined, TimedOut and Processing. 
   */
  public void setStatus(String status) {
    this.status = status;
  }

  public String getStatus() {
    return this.status;
  }
  /*
   * Optional date/time setting that specifies the date/time when the request stops for status changes for envelopes in the account. If no entry, the system uses the time of the call as the &#x60;to_date&#x60;.  
   */
  public void setToDate(String toDate) {
    this.toDate = toDate;
  }

  public String getToDate() {
    return this.toDate;
  }
  /*
   * If included in the query string, this is a comma separated list of envelope &#x60;transactionId&#x60;s.   If included in the &#x60;request_body&#x60;, this is a list of envelope &#x60;transactionId&#x60;s.   ###### Note: &#x60;transactionId&#x60;s are only valid in the DocuSign system for seven days.  
   */
  public void setTransactionIds(String transactionIds) {
    this.transactionIds = transactionIds;
  }

  public String getTransactionIds() {
    return this.transactionIds;
  }
  /*
   * 
   */
  public void setUserFilter(String userFilter) {
    this.userFilter = userFilter;
  }

  public String getUserFilter() {
    return this.userFilter;
  }
  /*
   * 
   */
  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getUserId() {
    return this.userId;
  }
  /*
   * 
   */
  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getUserName() {
    return this.userName;
  }
  }

   /**
   * Gets status changes for one or more envelopes.
   * Retrieves envelope status changes for all envelopes. You can modify the information returned by adding query strings to limit the request to check between certain dates and times, or for certain envelopes, or for certain status codes. It is recommended that you use one or more of the query strings in order to limit the size of the response.  ### Important: Unless you are requesting the status for specific envelopes (using the &#x60;envelopeIds&#x60; or &#x60;transactionIds&#x60; properties), you must add a set the &#x60;from_date&#x60; property in the request.  Getting envelope status using &#x60;transactionIds&#x60; is useful for offline signing situations where it can be used determine if an envelope was created or not, for the cases where a network connection was lost, before the envelope status could be returned.  ### Request Envelope Status Notes ###  The REST API GET /envelopes call uses certain filters to find results. In some cases requests are check for \&quot;any status change\&quot; instead of the just the single status requested. In these cases, more envelopes might be returned by the request than otherwise would be. For example, for a request with the begin date is set to Jan 1st, an end date set to Jan 7th and the status qualifier (&#x60;from_to_status&#x60;) set to &#x60;Delivered&#x60; &amp;mdash; the response set might contain envelopes that were created during that time period, but not delivered during the time period.  To avoid unnecessary database queries, the DocuSign system checks requests to ensure that the added filters will not result in a zero-size response before acting on the request. The following table shows the valid envelope statuses (in the Valid Current Statuses column) for the status qualifiers in the request. If the status and status qualifiers in the API request do not contain any of the values shown in the valid current statuses column, then an empty list is returned.  For example, a request with a status qualifier (from_to_status) of &#x60;Delivered&#x60; and a status of \&quot;&#x60;Created&#x60;,&#x60;Sent&#x60;\&quot;, DocuSign will always return an empty list. This is because the request essentially translates to: find the envelopes that were delivered between the begin and end dates that have a current status of &#x60;Created&#x60; or &#x60;Sent&#x60;, and since an envelope that has been delivered can never have a status of &#x60;Created&#x60; or &#x60;Sent&#x60;, a zero-size response would be generated. In this case, DocuSign does not run the request, but just returns the empty list.  Client applications should check that the statuses they are requesting make sense for a given status qualifier.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @return EnvelopesInformation
   */ 
  public EnvelopesInformation listStatusChanges(String accountId) throws ApiException {
    return listStatusChanges(accountId, null);
  }

  /**
   * Gets status changes for one or more envelopes.
   * Retrieves envelope status changes for all envelopes. You can modify the information returned by adding query strings to limit the request to check between certain dates and times, or for certain envelopes, or for certain status codes. It is recommended that you use one or more of the query strings in order to limit the size of the response.  ### Important: Unless you are requesting the status for specific envelopes (using the &#x60;envelopeIds&#x60; or &#x60;transactionIds&#x60; properties), you must add a set the &#x60;from_date&#x60; property in the request.  Getting envelope status using &#x60;transactionIds&#x60; is useful for offline signing situations where it can be used determine if an envelope was created or not, for the cases where a network connection was lost, before the envelope status could be returned.  ### Request Envelope Status Notes ###  The REST API GET /envelopes call uses certain filters to find results. In some cases requests are check for \&quot;any status change\&quot; instead of the just the single status requested. In these cases, more envelopes might be returned by the request than otherwise would be. For example, for a request with the begin date is set to Jan 1st, an end date set to Jan 7th and the status qualifier (&#x60;from_to_status&#x60;) set to &#x60;Delivered&#x60; &amp;mdash; the response set might contain envelopes that were created during that time period, but not delivered during the time period.  To avoid unnecessary database queries, the DocuSign system checks requests to ensure that the added filters will not result in a zero-size response before acting on the request. The following table shows the valid envelope statuses (in the Valid Current Statuses column) for the status qualifiers in the request. If the status and status qualifiers in the API request do not contain any of the values shown in the valid current statuses column, then an empty list is returned.  For example, a request with a status qualifier (from_to_status) of &#x60;Delivered&#x60; and a status of \&quot;&#x60;Created&#x60;,&#x60;Sent&#x60;\&quot;, DocuSign will always return an empty list. This is because the request essentially translates to: find the envelopes that were delivered between the begin and end dates that have a current status of &#x60;Created&#x60; or &#x60;Sent&#x60;, and since an envelope that has been delivered can never have a status of &#x60;Created&#x60; or &#x60;Sent&#x60;, a zero-size response would be generated. In this case, DocuSign does not run the request, but just returns the empty list.  Client applications should check that the statuses they are requesting make sense for a given status qualifier.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param options for modifying the method behavior.
   * @return EnvelopesInformation
   * @throws ApiException if fails to make API call
   */
  public EnvelopesInformation listStatusChanges(String accountId, EnvelopesApi.ListStatusChangesOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listStatusChanges");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("ac_status", options.acStatus));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("block", options.block));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("cdse_mode", options.cdseMode));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("continuation_token", options.continuationToken));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("count", options.count));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("custom_field", options.customField));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("email", options.email));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("envelope_ids", options.envelopeIds));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("exclude", options.exclude));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("folder_ids", options.folderIds));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("folder_types", options.folderTypes));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("from_date", options.fromDate));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("from_to_status", options.fromToStatus));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include", options.include));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_purge_information", options.includePurgeInformation));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("intersecting_folder_ids", options.intersectingFolderIds));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("last_queried_date", options.lastQueriedDate));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("order", options.order));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("order_by", options.orderBy));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("powerformids", options.powerformids));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("query_budget", options.queryBudget));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("requester_date_format", options.requesterDateFormat));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("search_text", options.searchText));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("start_position", options.startPosition));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("status", options.status));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("to_date", options.toDate));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("transaction_ids", options.transactionIds));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("user_filter", options.userFilter));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("user_id", options.userId));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("user_name", options.userName));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<EnvelopesInformation> localVarReturnType = new GenericType<EnvelopesInformation>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Gets the tabs information for a signer or sign-in-person recipient in an envelope. Retrieves information about the tabs associated with a recipient in a draft envelope.
  /// </summary>
  public class ListTabsOptions
  {
  private String includeAnchorTabLocations = null;
  private String includeMetadata = null;
  /*
   * When set to **true**, all tabs with anchor tab properties are included in the response.  
   */
  public void setIncludeAnchorTabLocations(String includeAnchorTabLocations) {
    this.includeAnchorTabLocations = includeAnchorTabLocations;
  }

  public String getIncludeAnchorTabLocations() {
    return this.includeAnchorTabLocations;
  }
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
   * Gets the tabs information for a signer or sign-in-person recipient in an envelope.
   * Retrieves information about the tabs associated with a recipient in a draft envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @return Tabs
   */ 
  public Tabs listTabs(String accountId, String envelopeId, String recipientId) throws ApiException {
    return listTabs(accountId, envelopeId, recipientId, null);
  }

  /**
   * Gets the tabs information for a signer or sign-in-person recipient in an envelope.
   * Retrieves information about the tabs associated with a recipient in a draft envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param options for modifying the method behavior.
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public Tabs listTabs(String accountId, String envelopeId, String recipientId, EnvelopesApi.ListTabsOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listTabs");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling listTabs");
    }
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling listTabs");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/tabs"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_anchor_tab_locations", options.includeAnchorTabLocations));
    }if (options != null) {
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

    GenericType<Tabs> localVarReturnType = new GenericType<Tabs>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Get List of Templates used in an Envelope This returns a list of the server-side templates, their name and ID, used in an envelope. 
  /// </summary>
  public class ListTemplatesOptions
  {
  private String include = null;
  /*
   * The possible values are:  matching_applied - This returns template matching information for the template. 
   */
  public void setInclude(String include) {
    this.include = include;
  }

  public String getInclude() {
    return this.include;
  }
  }

   /**
   * Get List of Templates used in an Envelope
   * This returns a list of the server-side templates, their name and ID, used in an envelope. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return TemplateInformation
   */ 
  public TemplateInformation listTemplates(String accountId, String envelopeId) throws ApiException {
    return listTemplates(accountId, envelopeId, null);
  }

  /**
   * Get List of Templates used in an Envelope
   * This returns a list of the server-side templates, their name and ID, used in an envelope. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param options for modifying the method behavior.
   * @return TemplateInformation
   * @throws ApiException if fails to make API call
   */
  public TemplateInformation listTemplates(String accountId, String envelopeId, EnvelopesApi.ListTemplatesOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listTemplates");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling listTemplates");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/templates"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    GenericType<TemplateInformation> localVarReturnType = new GenericType<TemplateInformation>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Gets the templates associated with a document in an existing envelope. Retrieves the templates associated with a document in the specified envelope.
  /// </summary>
  public class ListTemplatesForDocumentOptions
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
   * Gets the templates associated with a document in an existing envelope.
   * Retrieves the templates associated with a document in the specified envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @return TemplateInformation
   */ 
  public TemplateInformation listTemplatesForDocument(String accountId, String envelopeId, String documentId) throws ApiException {
    return listTemplatesForDocument(accountId, envelopeId, documentId, null);
  }

  /**
   * Gets the templates associated with a document in an existing envelope.
   * Retrieves the templates associated with a document in the specified envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param options for modifying the method behavior.
   * @return TemplateInformation
   * @throws ApiException if fails to make API call
   */
  public TemplateInformation listTemplatesForDocument(String accountId, String envelopeId, String documentId, EnvelopesApi.ListTemplatesForDocumentOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling listTemplatesForDocument");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling listTemplatesForDocument");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling listTemplatesForDocument");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/templates"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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

    GenericType<TemplateInformation> localVarReturnType = new GenericType<TemplateInformation>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Add an attachment to a DRAFT or IN-PROCESS envelope.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param attachmentId  (required)
   * @param attachment  (optional)
   * @return EnvelopeAttachmentsResult
   * @throws ApiException if fails to make API call
   */
  public EnvelopeAttachmentsResult putAttachment(String accountId, String envelopeId, String attachmentId, Attachment attachment) throws ApiException {
    Object localVarPostBody = attachment;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling putAttachment");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling putAttachment");
    }
    
    // verify the required parameter 'attachmentId' is set
    if (attachmentId == null) {
      throw new ApiException(400, "Missing the required parameter 'attachmentId' when calling putAttachment");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/attachments/{attachmentId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "attachmentId" + "\\}", apiClient.escapeString(attachmentId.toString()));

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

    GenericType<EnvelopeAttachmentsResult> localVarReturnType = new GenericType<EnvelopeAttachmentsResult>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Add one or more attachments to a DRAFT or IN-PROCESS envelope.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param envelopeAttachmentsRequest  (optional)
   * @return EnvelopeAttachmentsResult
   * @throws ApiException if fails to make API call
   */
  public EnvelopeAttachmentsResult putAttachments(String accountId, String envelopeId, EnvelopeAttachmentsRequest envelopeAttachmentsRequest) throws ApiException {
    Object localVarPostBody = envelopeAttachmentsRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling putAttachments");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling putAttachments");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/attachments"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    GenericType<EnvelopeAttachmentsResult> localVarReturnType = new GenericType<EnvelopeAttachmentsResult>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Rotates page image from an envelope for display.
   * Rotates page image from an envelope for display. The page image can be rotated to the left or right.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param pageNumber The page number being accessed. (required)
   * @param pageRequest  (optional)
   * @throws ApiException if fails to make API call
   */
  public void rotateDocumentPage(String accountId, String envelopeId, String documentId, String pageNumber, PageRequest pageRequest) throws ApiException {
    Object localVarPostBody = pageRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling rotateDocumentPage");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling rotateDocumentPage");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling rotateDocumentPage");
    }
    
    // verify the required parameter 'pageNumber' is set
    if (pageNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'pageNumber' when calling rotateDocumentPage");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/pages/{pageNumber}/page_image"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()))
      .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(pageNumber.toString()));

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
  /// <summary>
  /// Send Draft Envelope/Void Envelope/Move/Purge Envelope/Modify draft The Put Envelopes endpoint provides the following functionality:  * Sends the specified single draft envelope. Add {\&quot;status\&quot;:\&quot;sent\&quot;} to the request body to send the envelope.  * Voids the specified in-process envelope. Add {\&quot;status\&quot;:\&quot;voided\&quot;, \&quot;voidedReason\&quot;:\&quot;The reason for voiding the envelope\&quot;} to the request body to void the envelope.  * Replaces the current email subject and message for a draft envelope. Add {\&quot;emailSubject\&quot;:\&quot;subject\&quot;,  \&quot;emailBlurb\&quot;:\&quot;message\&quot;}  to the request body to modify the subject and message.  * Place the envelope documents and envelope metadata in a purge queue so that this information is removed from the DocuSign system. Add {\&quot;purgeState\&quot;:\&quot;purge type\&quot;} to the request body.  *Additional information on purging documents*  The purge request can only be used for completed envelopes that are not marked as the authoritative copy. The requesting user must have permission to purge documents and must be the sender (the requesting user can act as the sender using Send On Behalf Of).  ###### Note: If you have set the Document Retention policy on your account, envelope documents are automatically placed in the purge queue and the warning emails are sent at the end of the retention period.  ###### Note: You can set the Document Retention policy in the Classic DocuSign Experience by specifying the number of days to retain documents.  ###### Note: Setting a Document Retention policy is the same as setting a schedule for purging documents.  When the purge request is initiated the envelope documents, or documents and envelope metadata, are placed in a purge queue for deletion in 14 days. A warning email notification is sent to the sender and recipients associated with the envelope, notifying them that the envelope documents will be deleted in 14 days and providing a link to the documents. A second email is sent 7 days later with the same message. At the end of the 14-day period, the envelope documents are deleted from the system.  If &#x60;purgeState&#x3D;\&quot;documents_queued\&quot;&#x60; is used in the request, then only the documents are deleted and any corresponding attachments and tabs remain in the DocuSign system. If &#x60;purgeState&#x3D; \&quot;documents_and_metadata_queued\&quot;&#x60; is used in the request, then the documents, attachments, and tabs are deleted.
  /// </summary>
  public class UpdateOptions
  {
  private String advancedUpdate = null;
  private String resendEnvelope = null;
  /*
   * When set to **true**, allows the caller to update recipients, tabs, custom fields, notification, email settings and other envelope attributes. 
   */
  public void setAdvancedUpdate(String advancedUpdate) {
    this.advancedUpdate = advancedUpdate;
  }

  public String getAdvancedUpdate() {
    return this.advancedUpdate;
  }
  /*
   * When set to **true**, sends the specified envelope again. 
   */
  public void setResendEnvelope(String resendEnvelope) {
    this.resendEnvelope = resendEnvelope;
  }

  public String getResendEnvelope() {
    return this.resendEnvelope;
  }
  }

   /**
   * Send Draft Envelope/Void Envelope/Move/Purge Envelope/Modify draft
   * The Put Envelopes endpoint provides the following functionality:  * Sends the specified single draft envelope. Add {\&quot;status\&quot;:\&quot;sent\&quot;} to the request body to send the envelope.  * Voids the specified in-process envelope. Add {\&quot;status\&quot;:\&quot;voided\&quot;, \&quot;voidedReason\&quot;:\&quot;The reason for voiding the envelope\&quot;} to the request body to void the envelope.  * Replaces the current email subject and message for a draft envelope. Add {\&quot;emailSubject\&quot;:\&quot;subject\&quot;,  \&quot;emailBlurb\&quot;:\&quot;message\&quot;}  to the request body to modify the subject and message.  * Place the envelope documents and envelope metadata in a purge queue so that this information is removed from the DocuSign system. Add {\&quot;purgeState\&quot;:\&quot;purge type\&quot;} to the request body.  *Additional information on purging documents*  The purge request can only be used for completed envelopes that are not marked as the authoritative copy. The requesting user must have permission to purge documents and must be the sender (the requesting user can act as the sender using Send On Behalf Of).  ###### Note: If you have set the Document Retention policy on your account, envelope documents are automatically placed in the purge queue and the warning emails are sent at the end of the retention period.  ###### Note: You can set the Document Retention policy in the Classic DocuSign Experience by specifying the number of days to retain documents.  ###### Note: Setting a Document Retention policy is the same as setting a schedule for purging documents.  When the purge request is initiated the envelope documents, or documents and envelope metadata, are placed in a purge queue for deletion in 14 days. A warning email notification is sent to the sender and recipients associated with the envelope, notifying them that the envelope documents will be deleted in 14 days and providing a link to the documents. A second email is sent 7 days later with the same message. At the end of the 14-day period, the envelope documents are deleted from the system.  If &#x60;purgeState&#x3D;\&quot;documents_queued\&quot;&#x60; is used in the request, then only the documents are deleted and any corresponding attachments and tabs remain in the DocuSign system. If &#x60;purgeState&#x3D; \&quot;documents_and_metadata_queued\&quot;&#x60; is used in the request, then the documents, attachments, and tabs are deleted.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param envelope  (optional)
   * @return EnvelopeUpdateSummary
   */ 
  public EnvelopeUpdateSummary update(String accountId, String envelopeId, Envelope envelope) throws ApiException {
    return update(accountId, envelopeId, envelope, null);
  }

  /**
   * Send Draft Envelope/Void Envelope/Move/Purge Envelope/Modify draft
   * The Put Envelopes endpoint provides the following functionality:  * Sends the specified single draft envelope. Add {\&quot;status\&quot;:\&quot;sent\&quot;} to the request body to send the envelope.  * Voids the specified in-process envelope. Add {\&quot;status\&quot;:\&quot;voided\&quot;, \&quot;voidedReason\&quot;:\&quot;The reason for voiding the envelope\&quot;} to the request body to void the envelope.  * Replaces the current email subject and message for a draft envelope. Add {\&quot;emailSubject\&quot;:\&quot;subject\&quot;,  \&quot;emailBlurb\&quot;:\&quot;message\&quot;}  to the request body to modify the subject and message.  * Place the envelope documents and envelope metadata in a purge queue so that this information is removed from the DocuSign system. Add {\&quot;purgeState\&quot;:\&quot;purge type\&quot;} to the request body.  *Additional information on purging documents*  The purge request can only be used for completed envelopes that are not marked as the authoritative copy. The requesting user must have permission to purge documents and must be the sender (the requesting user can act as the sender using Send On Behalf Of).  ###### Note: If you have set the Document Retention policy on your account, envelope documents are automatically placed in the purge queue and the warning emails are sent at the end of the retention period.  ###### Note: You can set the Document Retention policy in the Classic DocuSign Experience by specifying the number of days to retain documents.  ###### Note: Setting a Document Retention policy is the same as setting a schedule for purging documents.  When the purge request is initiated the envelope documents, or documents and envelope metadata, are placed in a purge queue for deletion in 14 days. A warning email notification is sent to the sender and recipients associated with the envelope, notifying them that the envelope documents will be deleted in 14 days and providing a link to the documents. A second email is sent 7 days later with the same message. At the end of the 14-day period, the envelope documents are deleted from the system.  If &#x60;purgeState&#x3D;\&quot;documents_queued\&quot;&#x60; is used in the request, then only the documents are deleted and any corresponding attachments and tabs remain in the DocuSign system. If &#x60;purgeState&#x3D; \&quot;documents_and_metadata_queued\&quot;&#x60; is used in the request, then the documents, attachments, and tabs are deleted.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param envelope  (optional)
   * @param options for modifying the method behavior.
   * @return EnvelopeUpdateSummary
   * @throws ApiException if fails to make API call
   */
  public EnvelopeUpdateSummary update(String accountId, String envelopeId, Envelope envelope, EnvelopesApi.UpdateOptions options) throws ApiException {
    Object localVarPostBody = envelope;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling update");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling update");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("advanced_update", options.advancedUpdate));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("resend_envelope", options.resendEnvelope));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<EnvelopeUpdateSummary> localVarReturnType = new GenericType<EnvelopeUpdateSummary>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Integrity-Check and Commit a ChunkedUpload, readying it for use elsewhere. 
  /// </summary>
  public class UpdateChunkedUploadOptions
  {
  private String action = null;
  /*
   * 
   */
  public void setAction(String action) {
    this.action = action;
  }

  public String getAction() {
    return this.action;
  }
  }

   /**
   * Integrity-Check and Commit a ChunkedUpload, readying it for use elsewhere.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param chunkedUploadId  (required)
   * @return ChunkedUploadResponse
   */ 
  public ChunkedUploadResponse updateChunkedUpload(String accountId, String chunkedUploadId) throws ApiException {
    return updateChunkedUpload(accountId, chunkedUploadId, null);
  }

  /**
   * Integrity-Check and Commit a ChunkedUpload, readying it for use elsewhere.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param chunkedUploadId  (required)
   * @param options for modifying the method behavior.
   * @return ChunkedUploadResponse
   * @throws ApiException if fails to make API call
   */
  public ChunkedUploadResponse updateChunkedUpload(String accountId, String chunkedUploadId, EnvelopesApi.UpdateChunkedUploadOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateChunkedUpload");
    }
    
    // verify the required parameter 'chunkedUploadId' is set
    if (chunkedUploadId == null) {
      throw new ApiException(400, "Missing the required parameter 'chunkedUploadId' when calling updateChunkedUpload");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/chunked_uploads/{chunkedUploadId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "chunkedUploadId" + "\\}", apiClient.escapeString(chunkedUploadId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("action", options.action));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<ChunkedUploadResponse> localVarReturnType = new GenericType<ChunkedUploadResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Add a chunk, a chunk &#39;part&#39;, to an existing ChunkedUpload.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param chunkedUploadId  (required)
   * @param chunkedUploadPartSeq  (required)
   * @param chunkedUploadRequest  (optional)
   * @return ChunkedUploadResponse
   * @throws ApiException if fails to make API call
   */
  public ChunkedUploadResponse updateChunkedUploadPart(String accountId, String chunkedUploadId, String chunkedUploadPartSeq, ChunkedUploadRequest chunkedUploadRequest) throws ApiException {
    Object localVarPostBody = chunkedUploadRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateChunkedUploadPart");
    }
    
    // verify the required parameter 'chunkedUploadId' is set
    if (chunkedUploadId == null) {
      throw new ApiException(400, "Missing the required parameter 'chunkedUploadId' when calling updateChunkedUploadPart");
    }
    
    // verify the required parameter 'chunkedUploadPartSeq' is set
    if (chunkedUploadPartSeq == null) {
      throw new ApiException(400, "Missing the required parameter 'chunkedUploadPartSeq' when calling updateChunkedUploadPart");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/chunked_uploads/{chunkedUploadId}/{chunkedUploadPartSeq}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "chunkedUploadId" + "\\}", apiClient.escapeString(chunkedUploadId.toString()))
      .replaceAll("\\{" + "chunkedUploadPartSeq" + "\\}", apiClient.escapeString(chunkedUploadPartSeq.toString()));

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

    GenericType<ChunkedUploadResponse> localVarReturnType = new GenericType<ChunkedUploadResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Updates envelope custom fields in an envelope.
   * Updates the envelope custom fields in draft and in-process envelopes.  Each custom field used in an envelope must have a unique name. 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param customFields  (optional)
   * @return CustomFields
   * @throws ApiException if fails to make API call
   */
  public CustomFields updateCustomFields(String accountId, String envelopeId, CustomFields customFields) throws ApiException {
    Object localVarPostBody = customFields;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateCustomFields");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateCustomFields");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/custom_fields"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Update document information for Display Appliance
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateDocument(String accountId, String envelopeId, String documentId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateDocument");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateDocument");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling updateDocument");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/display_appliance_info/document/{documentId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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

  /**
   * Updates existing custom document fields in an existing envelope document.
   * Updates existing custom document fields in an existing envelope document.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param documentFieldsInformation  (optional)
   * @return DocumentFieldsInformation
   * @throws ApiException if fails to make API call
   */
  public DocumentFieldsInformation updateDocumentFields(String accountId, String envelopeId, String documentId, DocumentFieldsInformation documentFieldsInformation) throws ApiException {
    Object localVarPostBody = documentFieldsInformation;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateDocumentFields");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateDocumentFields");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling updateDocumentFields");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/fields"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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

    GenericType<DocumentFieldsInformation> localVarReturnType = new GenericType<DocumentFieldsInformation>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Updates the tabs for an envelope document
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @param tabs  (optional)
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public Tabs updateDocumentTabs(String accountId, String envelopeId, String documentId, Tabs tabs) throws ApiException {
    Object localVarPostBody = tabs;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateDocumentTabs");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateDocumentTabs");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling updateDocumentTabs");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}/tabs"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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

    GenericType<Tabs> localVarReturnType = new GenericType<Tabs>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Adds a document to an existing draft envelope.
   * Adds a document to an existing draft envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentId The ID of the document being accessed. (required)
   * @return EnvelopeDocument
   * @throws ApiException if fails to make API call
   */
  public EnvelopeDocument updateDocument_0(String accountId, String envelopeId, String documentId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateDocument_0");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateDocument_0");
    }
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling updateDocument_0");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents/{documentId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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

    GenericType<EnvelopeDocument> localVarReturnType = new GenericType<EnvelopeDocument>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Adds one or more documents to an existing envelope document.
   * Adds one or more documents to an existing envelope document.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param envelopeDefinition  (optional)
   * @return EnvelopeDocumentsResult
   * @throws ApiException if fails to make API call
   */
  public EnvelopeDocumentsResult updateDocuments(String accountId, String envelopeId, EnvelopeDefinition envelopeDefinition) throws ApiException {
    Object localVarPostBody = envelopeDefinition;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateDocuments");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateDocuments");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/documents"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    GenericType<EnvelopeDocumentsResult> localVarReturnType = new GenericType<EnvelopeDocumentsResult>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Updates the email setting overrides for an envelope.
   * Updates the existing email override settings for the specified envelope. Note that modifying email settings will only affect email communications that occur after the modification was made.  This can also be used to delete an individual email override setting by using an empty string for the value to be deleted.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param emailSettings  (optional)
   * @return EmailSettings
   * @throws ApiException if fails to make API call
   */
  public EmailSettings updateEmailSettings(String accountId, String envelopeId, EmailSettings emailSettings) throws ApiException {
    Object localVarPostBody = emailSettings;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateEmailSettings");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateEmailSettings");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/email_settings"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    GenericType<EmailSettings> localVarReturnType = new GenericType<EmailSettings>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Update an envelope transfer rule for an account.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeTransferRuleId  (required)
   * @param envelopeTransferRule  (optional)
   * @return EnvelopeTransferRule
   * @throws ApiException if fails to make API call
   */
  public EnvelopeTransferRule updateEnvelopeTransferRule(String accountId, String envelopeTransferRuleId, EnvelopeTransferRule envelopeTransferRule) throws ApiException {
    Object localVarPostBody = envelopeTransferRule;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateEnvelopeTransferRule");
    }
    
    // verify the required parameter 'envelopeTransferRuleId' is set
    if (envelopeTransferRuleId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeTransferRuleId' when calling updateEnvelopeTransferRule");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/transfer_rules/{envelopeTransferRuleId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeTransferRuleId" + "\\}", apiClient.escapeString(envelopeTransferRuleId.toString()));

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

    GenericType<EnvelopeTransferRule> localVarReturnType = new GenericType<EnvelopeTransferRule>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Update envelope transfer rules for an account.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeTransferRuleInformation  (optional)
   * @return EnvelopeTransferRuleInformation
   * @throws ApiException if fails to make API call
   */
  public EnvelopeTransferRuleInformation updateEnvelopeTransferRules(String accountId, EnvelopeTransferRuleInformation envelopeTransferRuleInformation) throws ApiException {
    Object localVarPostBody = envelopeTransferRuleInformation;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateEnvelopeTransferRules");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/transfer_rules"
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

    GenericType<EnvelopeTransferRuleInformation> localVarReturnType = new GenericType<EnvelopeTransferRuleInformation>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Updates the envelope workflow definition for an envelope.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param workflow  (optional)
   * @return Workflow
   * @throws ApiException if fails to make API call
   */
  public Workflow updateEnvelopeWorkflowDefinition(String accountId, String envelopeId, Workflow workflow) throws ApiException {
    Object localVarPostBody = workflow;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateEnvelopeWorkflowDefinition");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateEnvelopeWorkflowDefinition");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/workflow"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    GenericType<Workflow> localVarReturnType = new GenericType<Workflow>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Updates an envelope lock.
   * Updates the lock duration time or update the &#x60;lockedByApp&#x60; property information for the specified envelope. The user and integrator key must match the user specified by the &#x60;lockByUser&#x60; property and integrator key information and the &#x60;X-DocuSign-Edit&#x60; header must be included or an error will be generated.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param lockRequest  (optional)
   * @return LockInformation
   * @throws ApiException if fails to make API call
   */
  public LockInformation updateLock(String accountId, String envelopeId, LockRequest lockRequest) throws ApiException {
    Object localVarPostBody = lockRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateLock");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateLock");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/lock"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    GenericType<LockInformation> localVarReturnType = new GenericType<LockInformation>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Sets envelope notification (Reminders/Expirations) structure for an existing envelope.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param envelopeNotificationRequest  (optional)
   * @return Notification
   * @throws ApiException if fails to make API call
   */
  public Notification updateNotificationSettings(String accountId, String envelopeId, EnvelopeNotificationRequest envelopeNotificationRequest) throws ApiException {
    Object localVarPostBody = envelopeNotificationRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateNotificationSettings");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateNotificationSettings");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/notification"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    GenericType<Notification> localVarReturnType = new GenericType<Notification>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Update page information for Display Appliance
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @throws ApiException if fails to make API call
   */
  public void updatePageInfo(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updatePageInfo");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updatePageInfo");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/display_appliance_info/page_info"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

  /**
   * Set latest pdf for Display Appliance
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @return DisplayAppliancePdf
   * @throws ApiException if fails to make API call
   */
  public DisplayAppliancePdf updatePdf(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updatePdf");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updatePdf");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/display_appliance_info/pdf"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    GenericType<DisplayAppliancePdf> localVarReturnType = new GenericType<DisplayAppliancePdf>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Update pdf blobs for Display Appliance
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @throws ApiException if fails to make API call
   */
  public void updatePdfBlob(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updatePdfBlob");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updatePdfBlob");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/display_appliance_info/pdf_blobs"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

  /**
   * Update RecipientDeniedDocumentCopy for Display Appliance
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateRecipientDeniedDocumentCopy(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateRecipientDeniedDocumentCopy");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateRecipientDeniedDocumentCopy");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/display_appliance_info/recipient_denied_copy"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

  /**
   * Updates document visibility for the recipients
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param documentVisibilityList  (optional)
   * @return DocumentVisibilityList
   * @throws ApiException if fails to make API call
   */
  public DocumentVisibilityList updateRecipientDocumentVisibility(String accountId, String envelopeId, String recipientId, DocumentVisibilityList documentVisibilityList) throws ApiException {
    Object localVarPostBody = documentVisibilityList;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateRecipientDocumentVisibility");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateRecipientDocumentVisibility");
    }
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling updateRecipientDocumentVisibility");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/document_visibility"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

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

    GenericType<DocumentVisibilityList> localVarReturnType = new GenericType<DocumentVisibilityList>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Sets the initials image for an accountless signer.
   * Updates the initials image for a signer that does not have a DocuSign account. The supported image formats for this file are: gif, png, jpeg, and bmp. The file size must be less than 200K.  For the Authentication/Authorization for this call, the credentials must match the sender of the envelope, the recipient must be an accountless signer or in person signer. The account must have the &#x60;CanSendEnvelope&#x60; property set to **true** and the &#x60;ExpressSendOnly&#x60; property in &#x60;SendingUser&#x60; structure must be set to **false**.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateRecipientInitialsImage(String accountId, String envelopeId, String recipientId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateRecipientInitialsImage");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateRecipientInitialsImage");
    }
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling updateRecipientInitialsImage");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/initials_image"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

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
      "image/gif"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }

  /**
   * Sets the signature image for an accountless signer.
   * Updates the signature image for an accountless signer. The supported image formats for this file are: gif, png, jpeg, and bmp. The file size must be less than 200K.  For the Authentication/Authorization for this call, the credentials must match the sender of the envelope, the recipient must be an accountless signer or in person signer. The account must have the &#x60;CanSendEnvelope&#x60; property set to **true** and the &#x60;ExpressSendOnly&#x60; property in &#x60;SendingUser&#x60; structure must be set to **false**.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateRecipientSignatureImage(String accountId, String envelopeId, String recipientId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateRecipientSignatureImage");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateRecipientSignatureImage");
    }
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling updateRecipientSignatureImage");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/signature_image"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

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
      "image/gif"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /// <summary>
  /// Updates recipients in a draft envelope or corrects recipient information for an in process envelope. Updates recipients in a draft envelope or corrects recipient information for an in process envelope.   For draft envelopes, you can edit the following properties: &#x60;email&#x60;, &#x60;userName&#x60;, &#x60;routingOrder&#x60;, &#x60;faxNumber&#x60;, &#x60;deliveryMethod&#x60;, &#x60;accessCode&#x60;, and &#x60;requireIdLookup&#x60;.  Once an envelope has been sent, you can only edit: &#x60;email&#x60;, &#x60;userName&#x60;, &#x60;signerName&#x60;, &#x60;routingOrder&#x60;, &#x60;faxNumber&#x60;, and &#x60;deliveryMethod&#x60;. You can also select to resend an envelope by using the &#x60;resend_envelope&#x60; option.  If you send information for a recipient that does not already exist in a draft envelope, the recipient is added to the envelope (similar to the POST).
  /// </summary>
  public class UpdateRecipientsOptions
  {
  private String combineSameOrderRecipients = null;
  private String offlineSigning = null;
  private String resendEnvelope = null;
  /*
   * 
   */
  public void setCombineSameOrderRecipients(String combineSameOrderRecipients) {
    this.combineSameOrderRecipients = combineSameOrderRecipients;
  }

  public String getCombineSameOrderRecipients() {
    return this.combineSameOrderRecipients;
  }
  /*
   * 
   */
  public void setOfflineSigning(String offlineSigning) {
    this.offlineSigning = offlineSigning;
  }

  public String getOfflineSigning() {
    return this.offlineSigning;
  }
  /*
   * When set to **true**, resends the   envelope if the new recipient&#39;s routing order is before or the same as the envelope&#39;s next recipient. 
   */
  public void setResendEnvelope(String resendEnvelope) {
    this.resendEnvelope = resendEnvelope;
  }

  public String getResendEnvelope() {
    return this.resendEnvelope;
  }
  }

   /**
   * Updates recipients in a draft envelope or corrects recipient information for an in process envelope.
   * Updates recipients in a draft envelope or corrects recipient information for an in process envelope.   For draft envelopes, you can edit the following properties: &#x60;email&#x60;, &#x60;userName&#x60;, &#x60;routingOrder&#x60;, &#x60;faxNumber&#x60;, &#x60;deliveryMethod&#x60;, &#x60;accessCode&#x60;, and &#x60;requireIdLookup&#x60;.  Once an envelope has been sent, you can only edit: &#x60;email&#x60;, &#x60;userName&#x60;, &#x60;signerName&#x60;, &#x60;routingOrder&#x60;, &#x60;faxNumber&#x60;, and &#x60;deliveryMethod&#x60;. You can also select to resend an envelope by using the &#x60;resend_envelope&#x60; option.  If you send information for a recipient that does not already exist in a draft envelope, the recipient is added to the envelope (similar to the POST).
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipients  (optional)
   * @return RecipientsUpdateSummary
   */ 
  public RecipientsUpdateSummary updateRecipients(String accountId, String envelopeId, Recipients recipients) throws ApiException {
    return updateRecipients(accountId, envelopeId, recipients, null);
  }

  /**
   * Updates recipients in a draft envelope or corrects recipient information for an in process envelope.
   * Updates recipients in a draft envelope or corrects recipient information for an in process envelope.   For draft envelopes, you can edit the following properties: &#x60;email&#x60;, &#x60;userName&#x60;, &#x60;routingOrder&#x60;, &#x60;faxNumber&#x60;, &#x60;deliveryMethod&#x60;, &#x60;accessCode&#x60;, and &#x60;requireIdLookup&#x60;.  Once an envelope has been sent, you can only edit: &#x60;email&#x60;, &#x60;userName&#x60;, &#x60;signerName&#x60;, &#x60;routingOrder&#x60;, &#x60;faxNumber&#x60;, and &#x60;deliveryMethod&#x60;. You can also select to resend an envelope by using the &#x60;resend_envelope&#x60; option.  If you send information for a recipient that does not already exist in a draft envelope, the recipient is added to the envelope (similar to the POST).
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipients  (optional)
   * @param options for modifying the method behavior.
   * @return RecipientsUpdateSummary
   * @throws ApiException if fails to make API call
   */
  public RecipientsUpdateSummary updateRecipients(String accountId, String envelopeId, Recipients recipients, EnvelopesApi.UpdateRecipientsOptions options) throws ApiException {
    Object localVarPostBody = recipients;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateRecipients");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateRecipients");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/recipients"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("combine_same_order_recipients", options.combineSameOrderRecipients));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("offline_signing", options.offlineSigning));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("resend_envelope", options.resendEnvelope));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<RecipientsUpdateSummary> localVarReturnType = new GenericType<RecipientsUpdateSummary>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Updates document visibility for the recipients
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param documentVisibilityList  (optional)
   * @return DocumentVisibilityList
   * @throws ApiException if fails to make API call
   */
  public DocumentVisibilityList updateRecipientsDocumentVisibility(String accountId, String envelopeId, DocumentVisibilityList documentVisibilityList) throws ApiException {
    Object localVarPostBody = documentVisibilityList;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateRecipientsDocumentVisibility");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateRecipientsDocumentVisibility");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/recipients/document_visibility"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

    GenericType<DocumentVisibilityList> localVarReturnType = new GenericType<DocumentVisibilityList>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Updates the tabs for a recipient.  
   * Updates one or more tabs for a recipient in a draft envelope.
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param tabs  (optional)
   * @return Tabs
   * @throws ApiException if fails to make API call
   */
  public Tabs updateTabs(String accountId, String envelopeId, String recipientId, Tabs tabs) throws ApiException {
    Object localVarPostBody = tabs;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateTabs");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateTabs");
    }
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling updateTabs");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/recipients/{recipientId}/tabs"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

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

    GenericType<Tabs> localVarReturnType = new GenericType<Tabs>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Update encrypted tabs for envelope.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param envelopeId The envelopeId Guid of the envelope being accessed. (required)
   * @throws ApiException if fails to make API call
   */
  public void updateTabsBlob(String accountId, String envelopeId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateTabsBlob");
    }
    
    // verify the required parameter 'envelopeId' is set
    if (envelopeId == null) {
      throw new ApiException(400, "Missing the required parameter 'envelopeId' when calling updateTabsBlob");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/envelopes/{envelopeId}/tabs_blob"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "envelopeId" + "\\}", apiClient.escapeString(envelopeId.toString()));

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

  /**
   * Updates document visibility for the recipients
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param recipientId The ID of the recipient being accessed. (required)
   * @param templateDocumentVisibilityList  (optional)
   * @return TemplateDocumentVisibilityList
   * @throws ApiException if fails to make API call
   */
  public TemplateDocumentVisibilityList updateTemplateRecipientDocumentVisibility(String accountId, String templateId, String recipientId, TemplateDocumentVisibilityList templateDocumentVisibilityList) throws ApiException {
    Object localVarPostBody = templateDocumentVisibilityList;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateTemplateRecipientDocumentVisibility");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling updateTemplateRecipientDocumentVisibility");
    }
    
    // verify the required parameter 'recipientId' is set
    if (recipientId == null) {
      throw new ApiException(400, "Missing the required parameter 'recipientId' when calling updateTemplateRecipientDocumentVisibility");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/recipients/{recipientId}/document_visibility"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "recipientId" + "\\}", apiClient.escapeString(recipientId.toString()));

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

    GenericType<TemplateDocumentVisibilityList> localVarReturnType = new GenericType<TemplateDocumentVisibilityList>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Updates document visibility for the recipients
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param templateDocumentVisibilityList  (optional)
   * @return TemplateDocumentVisibilityList
   * @throws ApiException if fails to make API call
   */
  public TemplateDocumentVisibilityList updateTemplateRecipientsDocumentVisibility(String accountId, String templateId, TemplateDocumentVisibilityList templateDocumentVisibilityList) throws ApiException {
    Object localVarPostBody = templateDocumentVisibilityList;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateTemplateRecipientsDocumentVisibility");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling updateTemplateRecipientsDocumentVisibility");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/recipients/document_visibility"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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

    GenericType<TemplateDocumentVisibilityList> localVarReturnType = new GenericType<TemplateDocumentVisibilityList>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Updates the workflow definition for a template.
   * 
   * @param accountId The external account number (int) or account ID Guid. (required)
   * @param templateId The ID of the template being accessed. (required)
   * @param workflow  (optional)
   * @return Workflow
   * @throws ApiException if fails to make API call
   */
  public Workflow updateTemplateWorkflowDefinition(String accountId, String templateId, Workflow workflow) throws ApiException {
    Object localVarPostBody = workflow;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateTemplateWorkflowDefinition");
    }
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling updateTemplateWorkflowDefinition");
    }
    
    // create path and map variables
    String localVarPath = "/v2.1/accounts/{accountId}/templates/{templateId}/workflow"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "templateId" + "\\}", apiClient.escapeString(templateId.toString()));

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

    GenericType<Workflow> localVarReturnType = new GenericType<Workflow>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
