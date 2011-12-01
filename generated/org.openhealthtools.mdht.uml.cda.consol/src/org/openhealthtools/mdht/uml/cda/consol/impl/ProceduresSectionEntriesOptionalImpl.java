/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureAcivityObservation;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSectionEntriesOptional;

import org.openhealthtools.mdht.uml.cda.consol.operations.ProceduresSectionEntriesOptionalOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedures Section Entries Optional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProceduresSectionEntriesOptionalImpl extends SectionImpl implements ProceduresSectionEntriesOptional {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProceduresSectionEntriesOptionalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PROCEDURES_SECTION_ENTRIES_OPTIONAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceduresSectionEntriesOptionalTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProceduresSectionEntriesOptionalOperations.validateProceduresSectionEntriesOptionalTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceduresSectionEntriesOptionalCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProceduresSectionEntriesOptionalOperations.validateProceduresSectionEntriesOptionalCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceduresSectionEntriesOptionalText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProceduresSectionEntriesOptionalOperations.validateProceduresSectionEntriesOptionalText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceduresSectionEntriesOptionalProcedureActivityProcedure(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProceduresSectionEntriesOptionalOperations.validateProceduresSectionEntriesOptionalProcedureActivityProcedure(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceduresSectionEntriesOptionalProcedureAcivityObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProceduresSectionEntriesOptionalOperations.validateProceduresSectionEntriesOptionalProcedureAcivityObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceduresSectionEntriesOptionalProcedureActivityAct(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProceduresSectionEntriesOptionalOperations.validateProceduresSectionEntriesOptionalProcedureActivityAct(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcedureActivityProcedure> getProcedureActivityProcedures() {
		return ProceduresSectionEntriesOptionalOperations.getProcedureActivityProcedures(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcedureAcivityObservation> getProcedureAcivityObservations() {
		return ProceduresSectionEntriesOptionalOperations.getProcedureAcivityObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcedureActivityAct> getProcedureActivityActs() {
		return ProceduresSectionEntriesOptionalOperations.getProcedureActivityActs(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProceduresSectionEntriesOptional init() {
		CDAUtil.init(this);
		return this;
	}
} // ProceduresSectionEntriesOptionalImpl
