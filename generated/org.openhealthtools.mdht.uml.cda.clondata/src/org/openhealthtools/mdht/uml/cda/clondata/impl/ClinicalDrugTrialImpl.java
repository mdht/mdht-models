/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ActImpl;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.ClinicalDrugTrial;
import org.openhealthtools.mdht.uml.cda.clondata.operations.ClinicalDrugTrialOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clinical Drug Trial</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ClinicalDrugTrialImpl extends ActImpl implements ClinicalDrugTrial {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClinicalDrugTrialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CLONDATAPackage.eINSTANCE.getClinicalDrugTrial();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalDrugTrialTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalDrugTrialOperations.validateClinicalDrugTrialTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalDrugTrialClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalDrugTrialOperations.validateClinicalDrugTrialClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalDrugTrialCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalDrugTrialOperations.validateClinicalDrugTrialCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalDrugTrialCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalDrugTrialOperations.validateClinicalDrugTrialCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalDrugTrialMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalDrugTrialOperations.validateClinicalDrugTrialMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalDrugTrialStatusCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalDrugTrialOperations.validateClinicalDrugTrialStatusCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalDrugTrial init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalDrugTrial init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalDrugTrialStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ClinicalDrugTrialOperations.validateClinicalDrugTrialStatusCode(this, diagnostics, context);
	}
} // ClinicalDrugTrialImpl
