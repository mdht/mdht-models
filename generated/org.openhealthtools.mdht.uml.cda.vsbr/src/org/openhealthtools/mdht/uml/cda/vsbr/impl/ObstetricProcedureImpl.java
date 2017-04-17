/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.vsbr.ObstetricProcedure;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.ObstetricProcedureOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Obstetric Procedure</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ObstetricProcedureImpl extends org.eclipse.mdht.uml.cda.impl.ProcedureImpl implements ObstetricProcedure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObstetricProcedureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VsbrPackage.Literals.OBSTETRIC_PROCEDURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObstetricProcedureTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ObstetricProcedureOperations.validateObstetricProcedureTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObstetricProcedureClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ObstetricProcedureOperations.validateObstetricProcedureClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObstetricProcedureMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ObstetricProcedureOperations.validateObstetricProcedureMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObstetricProcedureNegationInd(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ObstetricProcedureOperations.validateObstetricProcedureNegationInd(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObstetricProcedureCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ObstetricProcedureOperations.validateObstetricProcedureCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObstetricProcedureCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ObstetricProcedureOperations.validateObstetricProcedureCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObstetricProcedure init() {
		return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObstetricProcedure init(
			Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
		org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
		return this;
	}
} // ObstetricProcedureImpl
