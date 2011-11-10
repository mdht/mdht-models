/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument;
import org.openhealthtools.mdht.uml.cda.consol.operations.UnstructuredDocumentOperations;
import org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unstructured Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UnstructuredDocumentImpl extends ClinicalDocumentImpl implements UnstructuredDocument {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnstructuredDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.UNSTRUCTURED_DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentPersonHasName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentPersonHasName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentRolesShallHaveAddrAndTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentRolesShallHaveAddrAndTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentRolesShouldHaveAddrAndTelecom(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentRolesShouldHaveAddrAndTelecom(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentOrganizationsHaveContactInfo(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentOrganizationsHaveContactInfo(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentTimePreciseToDay(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentTimePreciseToDay(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentTimePreciseToYear(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentTimePreciseToYear(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentTelephoneMatchesRegex(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentTelephoneMatchesRegex(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasTelephoneDialingDigits(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasTelephoneDialingDigits(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentUnknownTelephoneUsesNullFlavor(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentUnknownTelephoneUsesNullFlavor(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentTypeIdExtension(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentTypeIdExtension(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentIdRootFormat(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentIdRootFormat(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentOidLength(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentOidLength(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentLanguageCodeForm(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentLanguageCodeForm(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentSetIdAndVersionNumber(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentSetIdAndVersionNumber(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentSetIdAndIdAreUnique(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentSetIdAndIdAreUnique(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentCopyTimeNotPresent(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentCopyTimeNotPresent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasRecordTargetPatientRole(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasRecordTargetPatientRole(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasPatientBirthTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasPatientBirthTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasAdministrativeGenderCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasAdministrativeGenderCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasProviderOrganization(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasProviderOrganization(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasAuthorTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasAuthorTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasAssignedAuthorId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasAssignedAuthorId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasAssignedAuthorPersonOrDevice(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasAssignedAuthorPersonOrDevice(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasDataEntererAssignedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasDataEntererAssignedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasDataEntererTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasDataEntererTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasInformant(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasInformant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasInformantAssignedPersonOrRelatedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasInformantAssignedPersonOrRelatedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentLegalAuthenticatorHasAssignedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentLegalAuthenticatorHasAssignedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentAuthenticatorHasAssignedPerson(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentAuthenticatorHasAssignedPerson(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentTimePreciseToSecond(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentTimePreciseToSecond(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentTimePreciseToYearAndDay(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentTimePreciseToYearAndDay(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentTypeIdFixed(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentTypeIdFixed(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasOneRecordTarget(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasOneRecordTarget(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasAssignedAuthor(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasAssignedAuthor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentPatientRoleId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentPatientRoleId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasPatientRoleAddress(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasPatientRoleAddress(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasPatientName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasPatientName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasPatientGenderCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasPatientGenderCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasPatientBirthYear(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasPatientBirthYear(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasOriginalAuthor(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasOriginalAuthor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasScanningDevice(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasScanningDevice(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasScanDataEnterer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasScanDataEnterer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasRepresentedCustodianOrganizationName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasRepresentedCustodianOrganizationName(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasRepresentedCustodianOrganizationAddr(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasRepresentedCustodianOrganizationAddr(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentLegalAuthenticatorAssignedEntityId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentLegalAuthenticatorAssignedEntityId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasNonXMLBody(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasNonXMLBody(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasNonXMLBodyBinaryText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasNonXMLBodyBinaryText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasNonXMLBodyTextMediaType(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasNonXMLBodyTextMediaType(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentHasNonXMLBodyTextRepresentation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentHasNonXMLBodyTextRepresentation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentNoStructuredData(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentNoStructuredData(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentOnePatientPerDocument(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentOnePatientPerDocument(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentTypeId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentTypeId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentConfidentialityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentConfidentialityCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnstructuredDocumentLanguageCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return UnstructuredDocumentOperations.validateUnstructuredDocumentLanguageCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnstructuredDocument init() {
		CDAUtil.init(this);
		return this;
	}
} // UnstructuredDocumentImpl
