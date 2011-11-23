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
import org.openhealthtools.mdht.uml.cda.consol.ExternalReference;
import org.openhealthtools.mdht.uml.cda.consol.Procedure;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureEntryProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.consol.ProceduresSection;

import org.openhealthtools.mdht.uml.cda.consol.operations.ProceduresSectionOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedures Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProceduresSectionImpl extends ProceduresSectionEntriesOptionalImpl implements ProceduresSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProceduresSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PROCEDURES_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceduresSectionHasProcedureActivity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProceduresSectionOperations.validateProceduresSectionHasProcedureActivity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceduresSectionEntriesOptionalCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProceduresSectionOperations.validateProceduresSectionEntriesOptionalCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceduresSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProceduresSectionOperations.validateProceduresSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceduresSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProceduresSectionOperations.validateProceduresSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceduresSectionProcedureActivity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProceduresSectionOperations.validateProceduresSectionProcedureActivity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceduresSectionExternalReference(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProceduresSectionOperations.validateProceduresSectionExternalReference(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceduresSectionProcedureEntryProcedureActivityProcedure(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProceduresSectionOperations.validateProceduresSectionProcedureEntryProcedureActivityProcedure(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Procedure> getnullProcedureActivities() {
		return ProceduresSectionOperations.getnullProcedureActivities(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalReference getnullExternalReference() {
		return ProceduresSectionOperations.getnullExternalReference(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcedureEntryProcedureActivityProcedure> getnullProcedureEntryProcedureActivityProcedures() {
		return ProceduresSectionOperations.getnullProcedureEntryProcedureActivityProcedures(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProceduresSectionEntriesOptionalTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProceduresSectionOperations.validateProceduresSectionEntriesOptionalTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProceduresSection init() {
		CDAUtil.init(this);
		return this;
	}
} // ProceduresSectionImpl
