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
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.Indication2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureIndicationsSection2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Indications Section2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ProcedureIndicationsSection2Impl extends ProcedureIndicationsSectionImpl
		implements ProcedureIndicationsSection2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureIndicationsSection2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PROCEDURE_INDICATIONS_SECTION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureIndicationsSection2TemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureIndicationsSection2Operations.validateProcedureIndicationsSection2TemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Indication2> getConsolIndication2s() {
		return ProcedureIndicationsSection2Operations.getConsolIndication2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureIndicationsSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureIndicationsSection2Operations.validateProcedureIndicationsSectionCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureIndicationsSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureIndicationsSection2Operations.validateProcedureIndicationsSectionCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureIndicationsSectionIndication(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureIndicationsSection2Operations.validateProcedureIndicationsSectionIndication(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureIndicationsSection2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureIndicationsSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ProcedureIndicationsSection2Impl
