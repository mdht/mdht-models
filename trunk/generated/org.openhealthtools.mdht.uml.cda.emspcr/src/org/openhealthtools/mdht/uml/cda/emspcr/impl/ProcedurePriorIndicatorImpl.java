/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.ProcedurePriorIndicator;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.ProcedurePriorIndicatorOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Prior Indicator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProcedurePriorIndicatorImpl extends ObservationImpl implements ProcedurePriorIndicator {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected ProcedurePriorIndicatorImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.PROCEDURE_PRIOR_INDICATOR;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProcedurePriorIndicatorTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedurePriorIndicatorOperations.validateProcedurePriorIndicatorTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProcedurePriorIndicatorCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedurePriorIndicatorOperations.validateProcedurePriorIndicatorCodeP(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProcedurePriorIndicatorCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedurePriorIndicatorOperations.validateProcedurePriorIndicatorCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProcedurePriorIndicatorValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedurePriorIndicatorOperations.validateProcedurePriorIndicatorValue(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateProcedurePriorIndicatorMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedurePriorIndicatorOperations.validateProcedurePriorIndicatorMoodCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public ProcedurePriorIndicator init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedurePriorIndicator init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ProcedurePriorIndicatorImpl
