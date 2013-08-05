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

import org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestCause;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.CardiacArrestCauseOperations;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cardiac Arrest Cause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CardiacArrestCauseImpl extends ObservationImpl implements CardiacArrestCause {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardiacArrestCauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.CARDIAC_ARREST_CAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardiacArrestCauseTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CardiacArrestCauseOperations.validateCardiacArrestCauseTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardiacArrestCauseCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CardiacArrestCauseOperations.validateCardiacArrestCauseCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardiacArrestCauseValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CardiacArrestCauseOperations.validateCardiacArrestCauseValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardiacArrestCauseMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CardiacArrestCauseOperations.validateCardiacArrestCauseMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardiacArrestCause init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardiacArrestCause init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // CardiacArrestCauseImpl
