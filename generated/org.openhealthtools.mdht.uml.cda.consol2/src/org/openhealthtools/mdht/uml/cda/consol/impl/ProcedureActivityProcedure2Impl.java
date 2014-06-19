/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.Indication2;
import org.openhealthtools.mdht.uml.cda.consol.Instruction2;
import org.openhealthtools.mdht.uml.cda.consol.MedicationActivity2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2;

import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureActivityProcedure2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Activity Procedure2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProcedureActivityProcedure2Impl extends ProcedureActivityProcedureImpl implements
		ProcedureActivityProcedure2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureActivityProcedure2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PROCEDURE_ACTIVITY_PROCEDURE2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedure2InstructionsInversion(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedure2InstructionsInversion(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedureIndication2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedureIndication2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedureMedicationActivity2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedureMedicationActivity2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedureInstruction2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedureInstruction2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Indication2> getConsolIndication2s() {
		return ProcedureActivityProcedure2Operations.getConsolIndication2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationActivity2> getConsolMedicationActivity2s() {
		return ProcedureActivityProcedure2Operations.getConsolMedicationActivity2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instruction2 getConsolInstruction2() {
		return ProcedureActivityProcedure2Operations.getConsolInstruction2(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureActivityProcedureTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedureTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureActivityProcedureTargetSiteCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedureTargetSiteCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureActivityProcedureTargetSiteCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedureTargetSiteCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureActivityProcedureSpecimen(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityProcedure2Operations.validateProcedureActivityProcedureSpecimen(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureActivityProcedure2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureActivityProcedure2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ProcedureActivityProcedure2Impl
