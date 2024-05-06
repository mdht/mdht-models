/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.TribalAffiliation;
import org.openhealthtools.mdht.uml.cda.consol.operations.TribalAffiliationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tribal Affiliation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TribalAffiliationImpl extends SocialHistoryObservationV4Impl implements TribalAffiliation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TribalAffiliationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.TRIBAL_AFFILIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTribalAffiliationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TribalAffiliationOperations.validateTribalAffiliationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTribalAffiliationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TribalAffiliationOperations.validateTribalAffiliationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTribalAffiliationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TribalAffiliationOperations.validateTribalAffiliationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTribalAffiliationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TribalAffiliationOperations.validateTribalAffiliationEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTribalAffiliationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TribalAffiliationOperations.validateTribalAffiliationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTribalAffiliationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TribalAffiliationOperations.validateTribalAffiliationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTribalAffiliationIVLTSValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TribalAffiliationOperations.validateTribalAffiliationIVLTSValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTribalAffiliationIVLTSLow(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TribalAffiliationOperations.validateTribalAffiliationIVLTSLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTribalAffiliationIVLTSCenter(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TribalAffiliationOperations.validateTribalAffiliationIVLTSCenter(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTribalAffiliationIVLTSWidth(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TribalAffiliationOperations.validateTribalAffiliationIVLTSWidth(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTribalAffiliationIVLTSHigh(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TribalAffiliationOperations.validateTribalAffiliationIVLTSHigh(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSocialHistoryObservationV4TemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TribalAffiliationOperations.validateSocialHistoryObservationV4TemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Beacuse the Tribal Affiliation overrides value set constraint with code system constratint
	 * There is an issue with initialization of the object using base valueset (SNOMED) for the code system versus LOINC
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public TribalAffiliation init() {
		Initializer.Util.init(this);
		this.getCode().setCodeSystem("2.16.840.1.113883.6.1");
		this.getCode().setCodeSystemName("LOINC");
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TribalAffiliation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // TribalAffiliationImpl
