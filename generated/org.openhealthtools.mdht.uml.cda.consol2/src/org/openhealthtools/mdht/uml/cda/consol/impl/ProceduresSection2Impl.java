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
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityObservation2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure2;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSection2;

import org.openhealthtools.mdht.uml.cda.consol.operations.ProceduresSection2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedures Section2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProceduresSection2Impl extends ProceduresSectionEntriesOptional2Impl implements ProceduresSection2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProceduresSection2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PROCEDURES_SECTION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceduresSection2HasProcedureActivity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProceduresSection2Operations.validateProceduresSection2HasProcedureActivity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceduresSection2Title(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProceduresSection2Operations.validateProceduresSection2Title(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceduresSection2Text(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProceduresSection2Operations.validateProceduresSection2Text(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcedureActivityObservation2> getConsolProcedureActivityObservation2s() {
		return ProceduresSection2Operations.getConsolProcedureActivityObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcedureActivityAct2> getConsolProcedureActivityAct2s() {
		return ProceduresSection2Operations.getConsolProcedureActivityAct2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProceduresSectionEntriesOptionalTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProceduresSection2Operations.validateProceduresSectionEntriesOptionalTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProceduresSectionEntriesOptionalCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProceduresSection2Operations.validateProceduresSectionEntriesOptionalCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProceduresSectionEntriesOptionalCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProceduresSection2Operations.validateProceduresSectionEntriesOptionalCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProceduresSectionEntriesOptionalProcedureActivityProcedure2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProceduresSection2Operations.validateProceduresSectionEntriesOptionalProcedureActivityProcedure2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProceduresSectionEntriesOptionalProcedureActivityObservation2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProceduresSection2Operations.validateProceduresSectionEntriesOptionalProcedureActivityObservation2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProceduresSectionEntriesOptionalProcedureActivityAct2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProceduresSection2Operations.validateProceduresSectionEntriesOptionalProcedureActivityAct2(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcedureActivityProcedure2> getConsolProcedureActivityProcedure2s() {
		return ProceduresSection2Operations.getConsolProcedureActivityProcedure2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProceduresSection2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProceduresSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ProceduresSection2Impl
