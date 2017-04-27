/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrestWithTiming;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.CardiacArrestWithTimingOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cardiac Arrest With Timing</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CardiacArrestWithTimingImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements CardiacArrestWithTiming {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardiacArrestWithTimingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.CARDIAC_ARREST_WITH_TIMING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardiacArrestWithTimingTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CardiacArrestWithTimingOperations.validateCardiacArrestWithTimingTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardiacArrestWithTimingMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CardiacArrestWithTimingOperations.validateCardiacArrestWithTimingMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardiacArrestWithTimingCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CardiacArrestWithTimingOperations.validateCardiacArrestWithTimingCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardiacArrestWithTimingValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CardiacArrestWithTimingOperations.validateCardiacArrestWithTimingValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardiacArrestWithTiming init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public CardiacArrestWithTiming init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // CardiacArrestWithTimingImpl
