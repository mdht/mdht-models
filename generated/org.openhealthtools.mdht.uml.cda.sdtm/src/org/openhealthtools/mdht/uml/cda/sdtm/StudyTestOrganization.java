/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Study Test Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage#getStudyTestOrganization()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Study Test Organization'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Study Test OrganizationTemplateId Study Test OrganizationTypeCode Study Test OrganizationRoleOfPerformer' templateId.root='2.16.840.1.113883.10.20.23.88' typeCode='AUT'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmStudyTestOrganizationroleOfPerformer constraints.validation.error='Study Test OrganizationroleOfPerformerTemplateId Study Test OrganizationroleOfPerformerClassCode Study Test OrganizationroleOfPerformerperformerClassCode Study Test OrganizationroleOfPerformerperformerDeterminerCode Study Test OrganizationroleOfPerformerperformerName' templateId.root='null' classCode='ASSIGNED' constraints.validation.query='Study Test OrganizationroleOfPerformerperformerClassCode Study Test OrganizationroleOfPerformerperformerDeterminerCode Study Test OrganizationroleOfPerformerperformerName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmStudyTestOrganizationroleOfPerformerperformer classCode='ORG' constraints.validation.error='Study Test OrganizationroleOfPerformerperformerClassCode Study Test OrganizationroleOfPerformerperformerDeterminerCode Study Test OrganizationroleOfPerformerperformerName' determinerCode='INSTANCE'"
 * @generated
 */
public interface StudyTestOrganization extends org.eclipse.mdht.uml.cda.Participant2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Study Test OrganizationTemplateId'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.23.88\')'"
	 * @generated
	 */
	boolean validateStudyTestOrganizationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Study Test OrganizationTypeCode'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.typeCode=vocab::ParticipationType::AUT'"
	 * @generated
	 */
	boolean validateStudyTestOrganizationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Study Test OrganizationRoleOfPerformer'"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.participantRole->one(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(cda::ParticipantRole))'"
	 * @generated
	 */
	boolean validateStudyTestOrganizationRoleOfPerformer(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyTestOrganization init();
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StudyTestOrganization init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers);
} // StudyTestOrganization
