/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.OperativeNoteSurgicalProcedureSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.OperativeNoteSurgicalProcedureSectionOperations;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operative Note Surgical Procedure Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OperativeNoteSurgicalProcedureSectionImpl extends SectionImpl implements
		OperativeNoteSurgicalProcedureSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperativeNoteSurgicalProcedureSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteSurgicalProcedureSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteSurgicalProcedureSectionOperations.validateOperativeNoteSurgicalProcedureSectionTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteSurgicalProcedureSectionCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteSurgicalProcedureSectionOperations.validateOperativeNoteSurgicalProcedureSectionCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteSurgicalProcedureSectionText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteSurgicalProcedureSectionOperations.validateOperativeNoteSurgicalProcedureSectionText(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperativeNoteSurgicalProcedureSectionTitle(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return OperativeNoteSurgicalProcedureSectionOperations.validateOperativeNoteSurgicalProcedureSectionTitle(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperativeNoteSurgicalProcedureSection init() {
		CDAUtil.init(this);
		return this;
	}
} // OperativeNoteSurgicalProcedureSectionImpl
