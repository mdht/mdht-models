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
import org.openhealthtools.mdht.uml.cda.consol.ResultObservation2;
import org.openhealthtools.mdht.uml.cda.consol.ResultOrganizer2;
import org.openhealthtools.mdht.uml.cda.consol.operations.ResultOrganizer2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Organizer2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ResultOrganizer2Impl extends ResultOrganizerImpl implements ResultOrganizer2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultOrganizer2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.RESULT_ORGANIZER2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizer2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOrganizer2Operations.validateResultOrganizer2TemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizer2EffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOrganizer2Operations.validateResultOrganizer2EffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizer2AuthorParticipation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ResultOrganizer2Operations.validateResultOrganizer2AuthorParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizer2IVLTSLow(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOrganizer2Operations.validateResultOrganizer2IVLTSLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizer2IVLTSHigh(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOrganizer2Operations.validateResultOrganizer2IVLTSHigh(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResultObservation2> getConsolResultObservation2s() {
		return ResultOrganizer2Operations.getConsolResultObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultOrganizerCodeValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOrganizer2Operations.validateResultOrganizerCodeValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultOrganizerClassCodeValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOrganizer2Operations.validateResultOrganizerClassCodeValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultOrganizerResultObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOrganizer2Operations.validateResultOrganizerResultObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultOrganizer2 init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public ResultOrganizer2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // ResultOrganizer2Impl
