/**
 */
package org.hl7.cbcc.privacy.consentdirective.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.mdht.uml.cda.impl.ActImpl;
import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage;
import org.hl7.cbcc.privacy.consentdirective.ConsentAction;
import org.hl7.cbcc.privacy.consentdirective.ConsentDirectiveStructuredDefinition;
import org.hl7.cbcc.privacy.consentdirective.InformationCriteriaReferencesOrganizer;
import org.hl7.cbcc.privacy.consentdirective.SecurityLabel;
import org.hl7.cbcc.privacy.consentdirective.operations.ConsentDirectiveStructuredDefinitionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consent Directive Structured Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ConsentDirectiveStructuredDefinitionImpl extends ActImpl implements ConsentDirectiveStructuredDefinition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsentDirectiveStructuredDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CONSENTDIRECTIVEPackage.Literals.CONSENT_DIRECTIVE_STRUCTURED_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsentDirectiveStructuredDefinitionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsentDirectiveStructuredDefinitionOperations.validateConsentDirectiveStructuredDefinitionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsentDirectiveStructuredDefinitionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsentDirectiveStructuredDefinitionOperations.validateConsentDirectiveStructuredDefinitionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsentDirectiveStructuredDefinitionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsentDirectiveStructuredDefinitionOperations.validateConsentDirectiveStructuredDefinitionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsentDirectiveStructuredDefinitionMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsentDirectiveStructuredDefinitionOperations.validateConsentDirectiveStructuredDefinitionMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsentDirectiveStructuredDefinitionInformant(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsentDirectiveStructuredDefinitionOperations.validateConsentDirectiveStructuredDefinitionInformant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsentDirectiveStructuredDefinitionParticipant(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsentDirectiveStructuredDefinitionOperations.validateConsentDirectiveStructuredDefinitionParticipant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsentDirectiveStructuredDefinitionConsentAction(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsentDirectiveStructuredDefinitionOperations.validateConsentDirectiveStructuredDefinitionConsentAction(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsentDirectiveStructuredDefinitionInformationCriteriaReferencesOrganizer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsentDirectiveStructuredDefinitionOperations.validateConsentDirectiveStructuredDefinitionInformationCriteriaReferencesOrganizer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateConsentDirectiveStructuredDefinitionSecurityLabelCriteria(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConsentDirectiveStructuredDefinitionOperations.validateConsentDirectiveStructuredDefinitionSecurityLabelCriteria(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConsentAction> getConsentActions() {
		return ConsentDirectiveStructuredDefinitionOperations.getConsentActions(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InformationCriteriaReferencesOrganizer> getInformationCriteriaReferencesOrganizers() {
		return ConsentDirectiveStructuredDefinitionOperations.getInformationCriteriaReferencesOrganizers(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SecurityLabel> getSecurityLabelCriteria() {
		return ConsentDirectiveStructuredDefinitionOperations.getSecurityLabelCriteria(this);
	}
} //ConsentDirectiveStructuredDefinitionImpl
