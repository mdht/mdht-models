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
import org.openhealthtools.mdht.uml.cda.emspcr.MassCasualtyIndicator;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.MassCasualtyIndicatorOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mass Casualty Indicator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MassCasualtyIndicatorImpl extends ObservationImpl implements MassCasualtyIndicator {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected MassCasualtyIndicatorImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.MASS_CASUALTY_INDICATOR;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateMassCasualtyIndicatorTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MassCasualtyIndicatorOperations.validateMassCasualtyIndicatorTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateMassCasualtyIndicatorCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MassCasualtyIndicatorOperations.validateMassCasualtyIndicatorCodeP(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateMassCasualtyIndicatorCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MassCasualtyIndicatorOperations.validateMassCasualtyIndicatorCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateMassCasualtyIndicatorValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MassCasualtyIndicatorOperations.validateMassCasualtyIndicatorValue(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateMassCasualtyIndicatorMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MassCasualtyIndicatorOperations.validateMassCasualtyIndicatorMoodCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public MassCasualtyIndicator init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MassCasualtyIndicator init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // MassCasualtyIndicatorImpl
