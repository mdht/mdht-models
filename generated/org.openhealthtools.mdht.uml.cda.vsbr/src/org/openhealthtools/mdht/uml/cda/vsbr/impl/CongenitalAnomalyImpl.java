/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.vsbr.CongenitalAnomaly;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.CongenitalAnomalyOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Congenital Anomaly</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CongenitalAnomalyImpl extends ObservationImpl implements CongenitalAnomaly {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CongenitalAnomalyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VsbrPackage.Literals.CONGENITAL_ANOMALY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCongenitalAnomalyTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CongenitalAnomalyOperations.validateCongenitalAnomalyTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCongenitalAnomalyClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CongenitalAnomalyOperations.validateCongenitalAnomalyClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCongenitalAnomalyMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CongenitalAnomalyOperations.validateCongenitalAnomalyMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCongenitalAnomalyCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CongenitalAnomalyOperations.validateCongenitalAnomalyCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCongenitalAnomalyCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CongenitalAnomalyOperations.validateCongenitalAnomalyCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCongenitalAnomalyCodeVS(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CongenitalAnomalyOperations.validateCongenitalAnomalyCodeVS(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCongenitalAnomalyValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CongenitalAnomalyOperations.validateCongenitalAnomalyValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCongenitalAnomalyValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CongenitalAnomalyOperations.validateCongenitalAnomalyValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCongenitalAnomalyDownConfirmationAssociation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CongenitalAnomalyOperations.validateCongenitalAnomalyDownConfirmationAssociation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCongenitalAnomalyChromosomalDisorderConfirmationAssociation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return CongenitalAnomalyOperations.validateCongenitalAnomalyChromosomalDisorderConfirmationAssociation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CongenitalAnomaly init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CongenitalAnomaly init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // CongenitalAnomalyImpl
