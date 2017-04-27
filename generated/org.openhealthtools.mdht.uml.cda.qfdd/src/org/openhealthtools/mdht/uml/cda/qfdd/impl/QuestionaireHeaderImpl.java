/**
 */
package org.openhealthtools.mdht.uml.cda.qfdd.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ClinicalDocumentImpl;
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDPackage;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeader;
import org.openhealthtools.mdht.uml.cda.qfdd.operations.QuestionaireHeaderOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionaire Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class QuestionaireHeaderImpl extends ClinicalDocumentImpl implements QuestionaireHeader {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionaireHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QFDDPackage.Literals.QUESTIONAIRE_HEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeaderTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionaireHeaderOperations.validateQuestionaireHeaderTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeaderCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionaireHeaderOperations.validateQuestionaireHeaderCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeaderCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionaireHeaderOperations.validateQuestionaireHeaderCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeaderConfidentialityCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionaireHeaderOperations.validateQuestionaireHeaderConfidentialityCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeaderConfidentialityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionaireHeaderOperations.validateQuestionaireHeaderConfidentialityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeaderEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionaireHeaderOperations.validateQuestionaireHeaderEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeaderLanguageCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionaireHeaderOperations.validateQuestionaireHeaderLanguageCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeaderLanguageCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionaireHeaderOperations.validateQuestionaireHeaderLanguageCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeaderRealmCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionaireHeaderOperations.validateQuestionaireHeaderRealmCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeaderRealmCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionaireHeaderOperations.validateQuestionaireHeaderRealmCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeaderTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionaireHeaderOperations.validateQuestionaireHeaderTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeaderTypeId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionaireHeaderOperations.validateQuestionaireHeaderTypeId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeaderId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionaireHeaderOperations.validateQuestionaireHeaderId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeaderAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionaireHeaderOperations.validateQuestionaireHeaderAuthor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeaderCustodian(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionaireHeaderOperations.validateQuestionaireHeaderCustodian(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeaderRecordTarget(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionaireHeaderOperations.validateQuestionaireHeaderRecordTarget(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeaderTypeIdExtension(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionaireHeaderOperations.validateQuestionaireHeaderTypeIdExtension(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeaderTypeIdRoot(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionaireHeaderOperations.validateQuestionaireHeaderTypeIdRoot(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeaderAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionaireHeaderOperations.validateQuestionaireHeaderAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeaderAuthorAssignedAuthorAuthoringDeviceSoftwareName(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionaireHeaderOperations.validateQuestionaireHeaderAuthorAssignedAuthorAuthoringDeviceSoftwareName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeaderAuthorAssignedAuthorPersonName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionaireHeaderOperations.validateQuestionaireHeaderAuthorAssignedAuthorPersonName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeaderAuthorAssignedAuthorAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionaireHeaderOperations.validateQuestionaireHeaderAuthorAssignedAuthorAddr(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeaderAuthorAssignedAuthorId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionaireHeaderOperations.validateQuestionaireHeaderAuthorAssignedAuthorId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeaderAuthorAssignedAuthorTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionaireHeaderOperations.validateQuestionaireHeaderAuthorAssignedAuthorTelecom(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeaderAuthorAssignedAuthorAssignedAuthoringDevice(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionaireHeaderOperations.validateQuestionaireHeaderAuthorAssignedAuthorAssignedAuthoringDevice(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeaderAuthorAssignedAuthorAssignedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionaireHeaderOperations.validateQuestionaireHeaderAuthorAssignedAuthorAssignedPerson(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeaderAuthorAssignedAuthorRepresentedOrganization(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionaireHeaderOperations.validateQuestionaireHeaderAuthorAssignedAuthorRepresentedOrganization(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeaderAuthorTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionaireHeaderOperations.validateQuestionaireHeaderAuthorTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationAddr(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionaireHeaderOperations.validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationAddr(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionaireHeaderOperations.validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationName(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionaireHeaderOperations.validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationTelecom(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionaireHeaderOperations.validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationTelecom(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeaderCustodianAssignedCustodianRepresentedCustodianOrganization(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionaireHeaderOperations.validateQuestionaireHeaderCustodianAssignedCustodianRepresentedCustodianOrganization(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeaderCustodianAssignedCustodian(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionaireHeaderOperations.validateQuestionaireHeaderCustodianAssignedCustodian(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeaderRecordTargetPatientRoleIINullFlavor(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionaireHeaderOperations.validateQuestionaireHeaderRecordTargetPatientRoleIINullFlavor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeaderRecordTargetPatientRoleId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionaireHeaderOperations.validateQuestionaireHeaderRecordTargetPatientRoleId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireHeaderRecordTargetPatientRole(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionaireHeaderOperations.validateQuestionaireHeaderRecordTargetPatientRole(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionaireHeader init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QuestionaireHeader init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // QuestionaireHeaderImpl
