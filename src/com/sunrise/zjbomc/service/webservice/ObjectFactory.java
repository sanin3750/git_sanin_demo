
package com.sunrise.zjbomc.service.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sunrise.zjbomc.service.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _QueryPortalUserResponse_QNAME = new QName("http://webService.service.zjbomc.sunrise.com/", "queryPortalUserResponse");
    private final static QName _QueryPortalUserRoles_QNAME = new QName("http://webService.service.zjbomc.sunrise.com/", "queryPortalUserRoles");
    private final static QName _SetPortalUserRoles_QNAME = new QName("http://webService.service.zjbomc.sunrise.com/", "setPortalUserRoles");
    private final static QName _DeletePortalUserResponse_QNAME = new QName("http://webService.service.zjbomc.sunrise.com/", "deletePortalUserResponse");
    private final static QName _DeletePortalOrganizationResponse_QNAME = new QName("http://webService.service.zjbomc.sunrise.com/", "deletePortalOrganizationResponse");
    private final static QName _UpdatePortalOrganization_QNAME = new QName("http://webService.service.zjbomc.sunrise.com/", "updatePortalOrganization");
    private final static QName _SetPortalUserRolesResponse_QNAME = new QName("http://webService.service.zjbomc.sunrise.com/", "setPortalUserRolesResponse");
    private final static QName _AddPortalOrganization_QNAME = new QName("http://webService.service.zjbomc.sunrise.com/", "addPortalOrganization");
    private final static QName _AddPortalRole_QNAME = new QName("http://webService.service.zjbomc.sunrise.com/", "addPortalRole");
    private final static QName _UpdatePortalRole_QNAME = new QName("http://webService.service.zjbomc.sunrise.com/", "updatePortalRole");
    private final static QName _UpdatePortalUserResponse_QNAME = new QName("http://webService.service.zjbomc.sunrise.com/", "updatePortalUserResponse");
    private final static QName _DeletePortalUser_QNAME = new QName("http://webService.service.zjbomc.sunrise.com/", "deletePortalUser");
    private final static QName _AddPortalOrganizationResponse_QNAME = new QName("http://webService.service.zjbomc.sunrise.com/", "addPortalOrganizationResponse");
    private final static QName _DeletePortalRole_QNAME = new QName("http://webService.service.zjbomc.sunrise.com/", "deletePortalRole");
    private final static QName _DeletePortalRoleResponse_QNAME = new QName("http://webService.service.zjbomc.sunrise.com/", "deletePortalRoleResponse");
    private final static QName _UpdatePortalUserPwd_QNAME = new QName("http://webService.service.zjbomc.sunrise.com/", "updatePortalUserPwd");
    private final static QName _UpdatePortalOrganizationResponse_QNAME = new QName("http://webService.service.zjbomc.sunrise.com/", "updatePortalOrganizationResponse");
    private final static QName _AddPortalUser_QNAME = new QName("http://webService.service.zjbomc.sunrise.com/", "addPortalUser");
    private final static QName _QueryPortalOrganizations_QNAME = new QName("http://webService.service.zjbomc.sunrise.com/", "queryPortalOrganizations");
    private final static QName _AddPortalRoleResponse_QNAME = new QName("http://webService.service.zjbomc.sunrise.com/", "addPortalRoleResponse");
    private final static QName _QueryPortalOrganizationsResponse_QNAME = new QName("http://webService.service.zjbomc.sunrise.com/", "queryPortalOrganizationsResponse");
    private final static QName _UpdatePortalRoleResponse_QNAME = new QName("http://webService.service.zjbomc.sunrise.com/", "updatePortalRoleResponse");
    private final static QName _UpdatePortalUser_QNAME = new QName("http://webService.service.zjbomc.sunrise.com/", "updatePortalUser");
    private final static QName _QueryPortalRoles_QNAME = new QName("http://webService.service.zjbomc.sunrise.com/", "queryPortalRoles");
    private final static QName _UpdatePortalUserPwdResponse_QNAME = new QName("http://webService.service.zjbomc.sunrise.com/", "updatePortalUserPwdResponse");
    private final static QName _QueryPortalUserRolesResponse_QNAME = new QName("http://webService.service.zjbomc.sunrise.com/", "queryPortalUserRolesResponse");
    private final static QName _QueryPortalRolesResponse_QNAME = new QName("http://webService.service.zjbomc.sunrise.com/", "queryPortalRolesResponse");
    private final static QName _QueryPortalUser_QNAME = new QName("http://webService.service.zjbomc.sunrise.com/", "queryPortalUser");
    private final static QName _AddPortalUserResponse_QNAME = new QName("http://webService.service.zjbomc.sunrise.com/", "addPortalUserResponse");
    private final static QName _DeletePortalOrganization_QNAME = new QName("http://webService.service.zjbomc.sunrise.com/", "deletePortalOrganization");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sunrise.zjbomc.service.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SetPortalUserRoles }
     * 
     */
    public SetPortalUserRoles createSetPortalUserRoles() {
        return new SetPortalUserRoles();
    }

    /**
     * Create an instance of {@link DeletePortalUser }
     * 
     */
    public DeletePortalUser createDeletePortalUser() {
        return new DeletePortalUser();
    }

    /**
     * Create an instance of {@link QueryPortalUserRolesReq }
     * 
     */
    public QueryPortalUserRolesReq createQueryPortalUserRolesReq() {
        return new QueryPortalUserRolesReq();
    }

    /**
     * Create an instance of {@link DeletePortalRoleReq }
     * 
     */
    public DeletePortalRoleReq createDeletePortalRoleReq() {
        return new DeletePortalRoleReq();
    }

    /**
     * Create an instance of {@link QueryPortalRolesReq }
     * 
     */
    public QueryPortalRolesReq createQueryPortalRolesReq() {
        return new QueryPortalRolesReq();
    }

    /**
     * Create an instance of {@link AddPortalUser }
     * 
     */
    public AddPortalUser createAddPortalUser() {
        return new AddPortalUser();
    }

    /**
     * Create an instance of {@link QueryPortalUserRolesResponse }
     * 
     */
    public QueryPortalUserRolesResponse createQueryPortalUserRolesResponse() {
        return new QueryPortalUserRolesResponse();
    }

    /**
     * Create an instance of {@link DeletePortalOrganizationReq }
     * 
     */
    public DeletePortalOrganizationReq createDeletePortalOrganizationReq() {
        return new DeletePortalOrganizationReq();
    }

    /**
     * Create an instance of {@link QueryPortalUserReq }
     * 
     */
    public QueryPortalUserReq createQueryPortalUserReq() {
        return new QueryPortalUserReq();
    }

    /**
     * Create an instance of {@link QueryPortalUserResp }
     * 
     */
    public QueryPortalUserResp createQueryPortalUserResp() {
        return new QueryPortalUserResp();
    }

    /**
     * Create an instance of {@link QueryPortalOrganizationsResponse }
     * 
     */
    public QueryPortalOrganizationsResponse createQueryPortalOrganizationsResponse() {
        return new QueryPortalOrganizationsResponse();
    }

    /**
     * Create an instance of {@link DeletePortalOrganizationResp }
     * 
     */
    public DeletePortalOrganizationResp createDeletePortalOrganizationResp() {
        return new DeletePortalOrganizationResp();
    }

    /**
     * Create an instance of {@link DeletePortalOrganization }
     * 
     */
    public DeletePortalOrganization createDeletePortalOrganization() {
        return new DeletePortalOrganization();
    }

    /**
     * Create an instance of {@link UpdatePortalUserPwdResp }
     * 
     */
    public UpdatePortalUserPwdResp createUpdatePortalUserPwdResp() {
        return new UpdatePortalUserPwdResp();
    }

    /**
     * Create an instance of {@link QueryPortalRolesResponse }
     * 
     */
    public QueryPortalRolesResponse createQueryPortalRolesResponse() {
        return new QueryPortalRolesResponse();
    }

    /**
     * Create an instance of {@link UpdatePortalOrganization }
     * 
     */
    public UpdatePortalOrganization createUpdatePortalOrganization() {
        return new UpdatePortalOrganization();
    }

    /**
     * Create an instance of {@link SetPortalUserRolesResponse }
     * 
     */
    public SetPortalUserRolesResponse createSetPortalUserRolesResponse() {
        return new SetPortalUserRolesResponse();
    }

    /**
     * Create an instance of {@link QueryPortalRoles }
     * 
     */
    public QueryPortalRoles createQueryPortalRoles() {
        return new QueryPortalRoles();
    }

    /**
     * Create an instance of {@link UpdatePortalOrganizationResp }
     * 
     */
    public UpdatePortalOrganizationResp createUpdatePortalOrganizationResp() {
        return new UpdatePortalOrganizationResp();
    }

    /**
     * Create an instance of {@link UpdatePortalUserResponse }
     * 
     */
    public UpdatePortalUserResponse createUpdatePortalUserResponse() {
        return new UpdatePortalUserResponse();
    }

    /**
     * Create an instance of {@link UpdatePortalOrganizationResponse }
     * 
     */
    public UpdatePortalOrganizationResponse createUpdatePortalOrganizationResponse() {
        return new UpdatePortalOrganizationResponse();
    }

    /**
     * Create an instance of {@link AddPortalOrganizationResponse }
     * 
     */
    public AddPortalOrganizationResponse createAddPortalOrganizationResponse() {
        return new AddPortalOrganizationResponse();
    }

    /**
     * Create an instance of {@link UpdatePortalUserPwdResponse }
     * 
     */
    public UpdatePortalUserPwdResponse createUpdatePortalUserPwdResponse() {
        return new UpdatePortalUserPwdResponse();
    }

    /**
     * Create an instance of {@link OrganizationInfo }
     * 
     */
    public OrganizationInfo createOrganizationInfo() {
        return new OrganizationInfo();
    }

    /**
     * Create an instance of {@link UpdatePortalRole }
     * 
     */
    public UpdatePortalRole createUpdatePortalRole() {
        return new UpdatePortalRole();
    }

    /**
     * Create an instance of {@link UpdatePortalUserResp }
     * 
     */
    public UpdatePortalUserResp createUpdatePortalUserResp() {
        return new UpdatePortalUserResp();
    }

    /**
     * Create an instance of {@link UpdatePortalOrganizationReq }
     * 
     */
    public UpdatePortalOrganizationReq createUpdatePortalOrganizationReq() {
        return new UpdatePortalOrganizationReq();
    }

    /**
     * Create an instance of {@link QueryPortalOrganizations }
     * 
     */
    public QueryPortalOrganizations createQueryPortalOrganizations() {
        return new QueryPortalOrganizations();
    }

    /**
     * Create an instance of {@link DeletePortalUserResponse }
     * 
     */
    public DeletePortalUserResponse createDeletePortalUserResponse() {
        return new DeletePortalUserResponse();
    }

    /**
     * Create an instance of {@link DeletePortalRole }
     * 
     */
    public DeletePortalRole createDeletePortalRole() {
        return new DeletePortalRole();
    }

    /**
     * Create an instance of {@link UpdatePortalUserPwdReq }
     * 
     */
    public UpdatePortalUserPwdReq createUpdatePortalUserPwdReq() {
        return new UpdatePortalUserPwdReq();
    }

    /**
     * Create an instance of {@link AddPortalRole }
     * 
     */
    public AddPortalRole createAddPortalRole() {
        return new AddPortalRole();
    }

    /**
     * Create an instance of {@link UpdatePortalUserPwd }
     * 
     */
    public UpdatePortalUserPwd createUpdatePortalUserPwd() {
        return new UpdatePortalUserPwd();
    }

    /**
     * Create an instance of {@link SetPortalUserRolesResp }
     * 
     */
    public SetPortalUserRolesResp createSetPortalUserRolesResp() {
        return new SetPortalUserRolesResp();
    }

    /**
     * Create an instance of {@link DeletePortalUserResp }
     * 
     */
    public DeletePortalUserResp createDeletePortalUserResp() {
        return new DeletePortalUserResp();
    }

    /**
     * Create an instance of {@link RoleInfo }
     * 
     */
    public RoleInfo createRoleInfo() {
        return new RoleInfo();
    }

    /**
     * Create an instance of {@link AddPortalUserReq }
     * 
     */
    public AddPortalUserReq createAddPortalUserReq() {
        return new AddPortalUserReq();
    }

    /**
     * Create an instance of {@link AddPortalRoleResp }
     * 
     */
    public AddPortalRoleResp createAddPortalRoleResp() {
        return new AddPortalRoleResp();
    }

    /**
     * Create an instance of {@link QueryPortalRolesResp }
     * 
     */
    public QueryPortalRolesResp createQueryPortalRolesResp() {
        return new QueryPortalRolesResp();
    }

    /**
     * Create an instance of {@link AddPortalUserResponse }
     * 
     */
    public AddPortalUserResponse createAddPortalUserResponse() {
        return new AddPortalUserResponse();
    }

    /**
     * Create an instance of {@link DeletePortalOrganizationResponse }
     * 
     */
    public DeletePortalOrganizationResponse createDeletePortalOrganizationResponse() {
        return new DeletePortalOrganizationResponse();
    }

    /**
     * Create an instance of {@link QueryPortalUserRolesResp }
     * 
     */
    public QueryPortalUserRolesResp createQueryPortalUserRolesResp() {
        return new QueryPortalUserRolesResp();
    }

    /**
     * Create an instance of {@link DeletePortalUserReq }
     * 
     */
    public DeletePortalUserReq createDeletePortalUserReq() {
        return new DeletePortalUserReq();
    }

    /**
     * Create an instance of {@link DeletePortalRoleResponse }
     * 
     */
    public DeletePortalRoleResponse createDeletePortalRoleResponse() {
        return new DeletePortalRoleResponse();
    }

    /**
     * Create an instance of {@link AddPortalOrganization }
     * 
     */
    public AddPortalOrganization createAddPortalOrganization() {
        return new AddPortalOrganization();
    }

    /**
     * Create an instance of {@link AddPortalRoleReq }
     * 
     */
    public AddPortalRoleReq createAddPortalRoleReq() {
        return new AddPortalRoleReq();
    }

    /**
     * Create an instance of {@link AddPortalRoleResponse }
     * 
     */
    public AddPortalRoleResponse createAddPortalRoleResponse() {
        return new AddPortalRoleResponse();
    }

    /**
     * Create an instance of {@link AddPortalOrganizationResp }
     * 
     */
    public AddPortalOrganizationResp createAddPortalOrganizationResp() {
        return new AddPortalOrganizationResp();
    }

    /**
     * Create an instance of {@link UpdatePortalUser }
     * 
     */
    public UpdatePortalUser createUpdatePortalUser() {
        return new UpdatePortalUser();
    }

    /**
     * Create an instance of {@link UpdatePortalRoleResponse }
     * 
     */
    public UpdatePortalRoleResponse createUpdatePortalRoleResponse() {
        return new UpdatePortalRoleResponse();
    }

    /**
     * Create an instance of {@link DeletePortalRoleResp }
     * 
     */
    public DeletePortalRoleResp createDeletePortalRoleResp() {
        return new DeletePortalRoleResp();
    }

    /**
     * Create an instance of {@link UpdatePortalUserReq }
     * 
     */
    public UpdatePortalUserReq createUpdatePortalUserReq() {
        return new UpdatePortalUserReq();
    }

    /**
     * Create an instance of {@link QueryPortalOrganizationsResp }
     * 
     */
    public QueryPortalOrganizationsResp createQueryPortalOrganizationsResp() {
        return new QueryPortalOrganizationsResp();
    }

    /**
     * Create an instance of {@link UpdatePortalRoleReq }
     * 
     */
    public UpdatePortalRoleReq createUpdatePortalRoleReq() {
        return new UpdatePortalRoleReq();
    }

    /**
     * Create an instance of {@link QueryPortalUserResponse }
     * 
     */
    public QueryPortalUserResponse createQueryPortalUserResponse() {
        return new QueryPortalUserResponse();
    }

    /**
     * Create an instance of {@link QueryPortalUser }
     * 
     */
    public QueryPortalUser createQueryPortalUser() {
        return new QueryPortalUser();
    }

    /**
     * Create an instance of {@link SetPortalUserRolesReq }
     * 
     */
    public SetPortalUserRolesReq createSetPortalUserRolesReq() {
        return new SetPortalUserRolesReq();
    }

    /**
     * Create an instance of {@link UserDetailInfo }
     * 
     */
    public UserDetailInfo createUserDetailInfo() {
        return new UserDetailInfo();
    }

    /**
     * Create an instance of {@link AddUserInfo }
     * 
     */
    public AddUserInfo createAddUserInfo() {
        return new AddUserInfo();
    }

    /**
     * Create an instance of {@link UpdatePortalRoleResp }
     * 
     */
    public UpdatePortalRoleResp createUpdatePortalRoleResp() {
        return new UpdatePortalRoleResp();
    }

    /**
     * Create an instance of {@link QueryPortalUserRoles }
     * 
     */
    public QueryPortalUserRoles createQueryPortalUserRoles() {
        return new QueryPortalUserRoles();
    }

    /**
     * Create an instance of {@link AddPortalOrganizationReq }
     * 
     */
    public AddPortalOrganizationReq createAddPortalOrganizationReq() {
        return new AddPortalOrganizationReq();
    }

    /**
     * Create an instance of {@link QueryPortalOrganizationsReq }
     * 
     */
    public QueryPortalOrganizationsReq createQueryPortalOrganizationsReq() {
        return new QueryPortalOrganizationsReq();
    }

    /**
     * Create an instance of {@link AddPortalUserResp }
     * 
     */
    public AddPortalUserResp createAddPortalUserResp() {
        return new AddPortalUserResp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryPortalUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.service.zjbomc.sunrise.com/", name = "queryPortalUserResponse")
    public JAXBElement<QueryPortalUserResponse> createQueryPortalUserResponse(QueryPortalUserResponse value) {
        return new JAXBElement<QueryPortalUserResponse>(_QueryPortalUserResponse_QNAME, QueryPortalUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryPortalUserRoles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.service.zjbomc.sunrise.com/", name = "queryPortalUserRoles")
    public JAXBElement<QueryPortalUserRoles> createQueryPortalUserRoles(QueryPortalUserRoles value) {
        return new JAXBElement<QueryPortalUserRoles>(_QueryPortalUserRoles_QNAME, QueryPortalUserRoles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPortalUserRoles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.service.zjbomc.sunrise.com/", name = "setPortalUserRoles")
    public JAXBElement<SetPortalUserRoles> createSetPortalUserRoles(SetPortalUserRoles value) {
        return new JAXBElement<SetPortalUserRoles>(_SetPortalUserRoles_QNAME, SetPortalUserRoles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePortalUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.service.zjbomc.sunrise.com/", name = "deletePortalUserResponse")
    public JAXBElement<DeletePortalUserResponse> createDeletePortalUserResponse(DeletePortalUserResponse value) {
        return new JAXBElement<DeletePortalUserResponse>(_DeletePortalUserResponse_QNAME, DeletePortalUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePortalOrganizationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.service.zjbomc.sunrise.com/", name = "deletePortalOrganizationResponse")
    public JAXBElement<DeletePortalOrganizationResponse> createDeletePortalOrganizationResponse(DeletePortalOrganizationResponse value) {
        return new JAXBElement<DeletePortalOrganizationResponse>(_DeletePortalOrganizationResponse_QNAME, DeletePortalOrganizationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePortalOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.service.zjbomc.sunrise.com/", name = "updatePortalOrganization")
    public JAXBElement<UpdatePortalOrganization> createUpdatePortalOrganization(UpdatePortalOrganization value) {
        return new JAXBElement<UpdatePortalOrganization>(_UpdatePortalOrganization_QNAME, UpdatePortalOrganization.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPortalUserRolesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.service.zjbomc.sunrise.com/", name = "setPortalUserRolesResponse")
    public JAXBElement<SetPortalUserRolesResponse> createSetPortalUserRolesResponse(SetPortalUserRolesResponse value) {
        return new JAXBElement<SetPortalUserRolesResponse>(_SetPortalUserRolesResponse_QNAME, SetPortalUserRolesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPortalOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.service.zjbomc.sunrise.com/", name = "addPortalOrganization")
    public JAXBElement<AddPortalOrganization> createAddPortalOrganization(AddPortalOrganization value) {
        return new JAXBElement<AddPortalOrganization>(_AddPortalOrganization_QNAME, AddPortalOrganization.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPortalRole }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.service.zjbomc.sunrise.com/", name = "addPortalRole")
    public JAXBElement<AddPortalRole> createAddPortalRole(AddPortalRole value) {
        return new JAXBElement<AddPortalRole>(_AddPortalRole_QNAME, AddPortalRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePortalRole }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.service.zjbomc.sunrise.com/", name = "updatePortalRole")
    public JAXBElement<UpdatePortalRole> createUpdatePortalRole(UpdatePortalRole value) {
        return new JAXBElement<UpdatePortalRole>(_UpdatePortalRole_QNAME, UpdatePortalRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePortalUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.service.zjbomc.sunrise.com/", name = "updatePortalUserResponse")
    public JAXBElement<UpdatePortalUserResponse> createUpdatePortalUserResponse(UpdatePortalUserResponse value) {
        return new JAXBElement<UpdatePortalUserResponse>(_UpdatePortalUserResponse_QNAME, UpdatePortalUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePortalUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.service.zjbomc.sunrise.com/", name = "deletePortalUser")
    public JAXBElement<DeletePortalUser> createDeletePortalUser(DeletePortalUser value) {
        return new JAXBElement<DeletePortalUser>(_DeletePortalUser_QNAME, DeletePortalUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPortalOrganizationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.service.zjbomc.sunrise.com/", name = "addPortalOrganizationResponse")
    public JAXBElement<AddPortalOrganizationResponse> createAddPortalOrganizationResponse(AddPortalOrganizationResponse value) {
        return new JAXBElement<AddPortalOrganizationResponse>(_AddPortalOrganizationResponse_QNAME, AddPortalOrganizationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePortalRole }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.service.zjbomc.sunrise.com/", name = "deletePortalRole")
    public JAXBElement<DeletePortalRole> createDeletePortalRole(DeletePortalRole value) {
        return new JAXBElement<DeletePortalRole>(_DeletePortalRole_QNAME, DeletePortalRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePortalRoleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.service.zjbomc.sunrise.com/", name = "deletePortalRoleResponse")
    public JAXBElement<DeletePortalRoleResponse> createDeletePortalRoleResponse(DeletePortalRoleResponse value) {
        return new JAXBElement<DeletePortalRoleResponse>(_DeletePortalRoleResponse_QNAME, DeletePortalRoleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePortalUserPwd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.service.zjbomc.sunrise.com/", name = "updatePortalUserPwd")
    public JAXBElement<UpdatePortalUserPwd> createUpdatePortalUserPwd(UpdatePortalUserPwd value) {
        return new JAXBElement<UpdatePortalUserPwd>(_UpdatePortalUserPwd_QNAME, UpdatePortalUserPwd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePortalOrganizationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.service.zjbomc.sunrise.com/", name = "updatePortalOrganizationResponse")
    public JAXBElement<UpdatePortalOrganizationResponse> createUpdatePortalOrganizationResponse(UpdatePortalOrganizationResponse value) {
        return new JAXBElement<UpdatePortalOrganizationResponse>(_UpdatePortalOrganizationResponse_QNAME, UpdatePortalOrganizationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPortalUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.service.zjbomc.sunrise.com/", name = "addPortalUser")
    public JAXBElement<AddPortalUser> createAddPortalUser(AddPortalUser value) {
        return new JAXBElement<AddPortalUser>(_AddPortalUser_QNAME, AddPortalUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryPortalOrganizations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.service.zjbomc.sunrise.com/", name = "queryPortalOrganizations")
    public JAXBElement<QueryPortalOrganizations> createQueryPortalOrganizations(QueryPortalOrganizations value) {
        return new JAXBElement<QueryPortalOrganizations>(_QueryPortalOrganizations_QNAME, QueryPortalOrganizations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPortalRoleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.service.zjbomc.sunrise.com/", name = "addPortalRoleResponse")
    public JAXBElement<AddPortalRoleResponse> createAddPortalRoleResponse(AddPortalRoleResponse value) {
        return new JAXBElement<AddPortalRoleResponse>(_AddPortalRoleResponse_QNAME, AddPortalRoleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryPortalOrganizationsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.service.zjbomc.sunrise.com/", name = "queryPortalOrganizationsResponse")
    public JAXBElement<QueryPortalOrganizationsResponse> createQueryPortalOrganizationsResponse(QueryPortalOrganizationsResponse value) {
        return new JAXBElement<QueryPortalOrganizationsResponse>(_QueryPortalOrganizationsResponse_QNAME, QueryPortalOrganizationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePortalRoleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.service.zjbomc.sunrise.com/", name = "updatePortalRoleResponse")
    public JAXBElement<UpdatePortalRoleResponse> createUpdatePortalRoleResponse(UpdatePortalRoleResponse value) {
        return new JAXBElement<UpdatePortalRoleResponse>(_UpdatePortalRoleResponse_QNAME, UpdatePortalRoleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePortalUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.service.zjbomc.sunrise.com/", name = "updatePortalUser")
    public JAXBElement<UpdatePortalUser> createUpdatePortalUser(UpdatePortalUser value) {
        return new JAXBElement<UpdatePortalUser>(_UpdatePortalUser_QNAME, UpdatePortalUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryPortalRoles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.service.zjbomc.sunrise.com/", name = "queryPortalRoles")
    public JAXBElement<QueryPortalRoles> createQueryPortalRoles(QueryPortalRoles value) {
        return new JAXBElement<QueryPortalRoles>(_QueryPortalRoles_QNAME, QueryPortalRoles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePortalUserPwdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.service.zjbomc.sunrise.com/", name = "updatePortalUserPwdResponse")
    public JAXBElement<UpdatePortalUserPwdResponse> createUpdatePortalUserPwdResponse(UpdatePortalUserPwdResponse value) {
        return new JAXBElement<UpdatePortalUserPwdResponse>(_UpdatePortalUserPwdResponse_QNAME, UpdatePortalUserPwdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryPortalUserRolesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.service.zjbomc.sunrise.com/", name = "queryPortalUserRolesResponse")
    public JAXBElement<QueryPortalUserRolesResponse> createQueryPortalUserRolesResponse(QueryPortalUserRolesResponse value) {
        return new JAXBElement<QueryPortalUserRolesResponse>(_QueryPortalUserRolesResponse_QNAME, QueryPortalUserRolesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryPortalRolesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.service.zjbomc.sunrise.com/", name = "queryPortalRolesResponse")
    public JAXBElement<QueryPortalRolesResponse> createQueryPortalRolesResponse(QueryPortalRolesResponse value) {
        return new JAXBElement<QueryPortalRolesResponse>(_QueryPortalRolesResponse_QNAME, QueryPortalRolesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryPortalUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.service.zjbomc.sunrise.com/", name = "queryPortalUser")
    public JAXBElement<QueryPortalUser> createQueryPortalUser(QueryPortalUser value) {
        return new JAXBElement<QueryPortalUser>(_QueryPortalUser_QNAME, QueryPortalUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPortalUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.service.zjbomc.sunrise.com/", name = "addPortalUserResponse")
    public JAXBElement<AddPortalUserResponse> createAddPortalUserResponse(AddPortalUserResponse value) {
        return new JAXBElement<AddPortalUserResponse>(_AddPortalUserResponse_QNAME, AddPortalUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePortalOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.service.zjbomc.sunrise.com/", name = "deletePortalOrganization")
    public JAXBElement<DeletePortalOrganization> createDeletePortalOrganization(DeletePortalOrganization value) {
        return new JAXBElement<DeletePortalOrganization>(_DeletePortalOrganization_QNAME, DeletePortalOrganization.class, null, value);
    }

}
