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
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureFindingsSection2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureFindingsSection2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Findings Section2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ProcedureFindingsSection2Impl extends ProcedureFindingsSectionImpl implements ProcedureFindingsSection2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureFindingsSection2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PROCEDURE_FINDINGS_SECTION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureFindingsSection2TemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureFindingsSection2Operations.validateProcedureFindingsSection2TemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProblemObservation2> getConsolProblemObservation2s() {
		return ProcedureFindingsSection2Operations.getConsolProblemObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureFindingsSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureFindingsSection2Operations.validateProcedureFindingsSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureFindingsSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureFindingsSection2Operations.validateProcedureFindingsSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProcedureFindingsSectionProblemObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ProcedureFindingsSection2Operations.validateProcedureFindingsSectionProblemObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureFindingsSection2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcedureFindingsSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ProcedureFindingsSection2Impl
