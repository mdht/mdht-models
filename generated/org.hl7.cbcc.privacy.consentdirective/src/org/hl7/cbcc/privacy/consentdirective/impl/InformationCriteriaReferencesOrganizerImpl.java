/**
 */
package org.hl7.cbcc.privacy.consentdirective.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.mdht.uml.cda.impl.OrganizerImpl;
import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage;
import org.hl7.cbcc.privacy.consentdirective.ConfidentialitySecurityObservation;
import org.hl7.cbcc.privacy.consentdirective.CriteriumInformationDefinition;
import org.hl7.cbcc.privacy.consentdirective.CriteriumRelatedProtectedProblem;
import org.hl7.cbcc.privacy.consentdirective.InformationCriteriaReferencesOrganizer;
import org.hl7.cbcc.privacy.consentdirective.operations.InformationCriteriaReferencesOrganizerOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Information Criteria References Organizer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class InformationCriteriaReferencesOrganizerImpl extends OrganizerImpl implements InformationCriteriaReferencesOrganizer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationCriteriaReferencesOrganizerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CONSENTDIRECTIVEPackage.Literals.INFORMATION_CRITERIA_REFERENCES_ORGANIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInformationCriteriaReferencesOrganizerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InformationCriteriaReferencesOrganizerOperations.validateInformationCriteriaReferencesOrganizerTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInformationCriteriaReferencesOrganizerMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InformationCriteriaReferencesOrganizerOperations.validateInformationCriteriaReferencesOrganizerMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInformationCriteriaReferencesOrganizerInformationDefinition(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InformationCriteriaReferencesOrganizerOperations.validateInformationCriteriaReferencesOrganizerInformationDefinition(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInformationCriteriaReferencesOrganizerRelatedProtectedProblem(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InformationCriteriaReferencesOrganizerOperations.validateInformationCriteriaReferencesOrganizerRelatedProtectedProblem(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInformationCriteriaReferencesOrganizerConfidentialityCodeLabel(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InformationCriteriaReferencesOrganizerOperations.validateInformationCriteriaReferencesOrganizerConfidentialityCodeLabel(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CriteriumInformationDefinition> getInformationDefinitions() {
		return InformationCriteriaReferencesOrganizerOperations.getInformationDefinitions(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CriteriumRelatedProtectedProblem> getRelatedProtectedProblems() {
		return InformationCriteriaReferencesOrganizerOperations.getRelatedProtectedProblems(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConfidentialitySecurityObservation> getConfidentialityCodeLabels() {
		return InformationCriteriaReferencesOrganizerOperations.getConfidentialityCodeLabels(this);
	}
} //InformationCriteriaReferencesOrganizerImpl
