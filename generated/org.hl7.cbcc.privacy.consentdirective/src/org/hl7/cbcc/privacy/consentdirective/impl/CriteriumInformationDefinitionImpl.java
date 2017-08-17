/**
 */
package org.hl7.cbcc.privacy.consentdirective.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.mdht.uml.cda.impl.ObservationImpl;
import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage;
import org.hl7.cbcc.privacy.consentdirective.CriteriumInformationDefinition;
import org.hl7.cbcc.privacy.consentdirective.operations.CriteriumInformationDefinitionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Criterium Information Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CriteriumInformationDefinitionImpl extends ObservationImpl implements CriteriumInformationDefinition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CriteriumInformationDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CONSENTDIRECTIVEPackage.Literals.CRITERIUM_INFORMATION_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCriteriumInformationDefinitionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CriteriumInformationDefinitionOperations.validateCriteriumInformationDefinitionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCriteriumInformationDefinitionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CriteriumInformationDefinitionOperations.validateCriteriumInformationDefinitionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCriteriumInformationDefinitionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CriteriumInformationDefinitionOperations.validateCriteriumInformationDefinitionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCriteriumInformationDefinitionEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CriteriumInformationDefinitionOperations.validateCriteriumInformationDefinitionEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCriteriumInformationDefinitionMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CriteriumInformationDefinitionOperations.validateCriteriumInformationDefinitionMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCriteriumInformationDefinitionId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CriteriumInformationDefinitionOperations.validateCriteriumInformationDefinitionId(this, diagnostics, context);
	}
} //CriteriumInformationDefinitionImpl
