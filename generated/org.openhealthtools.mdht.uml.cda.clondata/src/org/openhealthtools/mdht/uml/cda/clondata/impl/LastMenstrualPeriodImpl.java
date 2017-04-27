/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.LastMenstrualPeriod;
import org.openhealthtools.mdht.uml.cda.clondata.operations.LastMenstrualPeriodOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Last Menstrual Period</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LastMenstrualPeriodImpl extends ObservationImpl implements LastMenstrualPeriod {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LastMenstrualPeriodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CLONDATAPackage.eINSTANCE.getLastMenstrualPeriod();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLastMenstrualPeriodTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LastMenstrualPeriodOperations.validateLastMenstrualPeriodTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLastMenstrualPeriodClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LastMenstrualPeriodOperations.validateLastMenstrualPeriodClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLastMenstrualPeriodCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LastMenstrualPeriodOperations.validateLastMenstrualPeriodCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLastMenstrualPeriodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LastMenstrualPeriodOperations.validateLastMenstrualPeriodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLastMenstrualPeriodEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LastMenstrualPeriodOperations.validateLastMenstrualPeriodEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLastMenstrualPeriodMoodCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LastMenstrualPeriodOperations.validateLastMenstrualPeriodMoodCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLastMenstrualPeriodMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LastMenstrualPeriodOperations.validateLastMenstrualPeriodMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLastMenstrualPeriodStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LastMenstrualPeriodOperations.validateLastMenstrualPeriodStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LastMenstrualPeriod init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LastMenstrualPeriod init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // LastMenstrualPeriodImpl
