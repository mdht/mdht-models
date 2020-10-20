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
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection2;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation2;
import org.openhealthtools.mdht.uml.cda.consol.operations.HistoryOfPastIllnessSection2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>History Of Past Illness Section2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HistoryOfPastIllnessSection2Impl extends HistoryOfPastIllnessSectionImpl
		implements HistoryOfPastIllnessSection2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoryOfPastIllnessSection2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.HISTORY_OF_PAST_ILLNESS_SECTION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryOfPastIllnessSection2TemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryOfPastIllnessSection2Operations.validateHistoryOfPastIllnessSection2TemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProblemObservation2> getConsolProblemObservation2s() {
		return HistoryOfPastIllnessSection2Operations.getConsolProblemObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHistoryOfPastIllnessSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryOfPastIllnessSection2Operations.validateHistoryOfPastIllnessSectionCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHistoryOfPastIllnessSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryOfPastIllnessSection2Operations.validateHistoryOfPastIllnessSectionCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateHistoryOfPastIllnessSectionProblemObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HistoryOfPastIllnessSection2Operations.validateHistoryOfPastIllnessSectionProblemObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryOfPastIllnessSection2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryOfPastIllnessSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // HistoryOfPastIllnessSection2Impl
