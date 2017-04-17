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
import org.openhealthtools.mdht.uml.cda.emspcr.ArrestRhythm;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.ArrestRhythmOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arrest Rhythm</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ArrestRhythmImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements ArrestRhythm {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrestRhythmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.ARREST_RHYTHM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrestRhythmTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ArrestRhythmOperations.validateArrestRhythmTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrestRhythmMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ArrestRhythmOperations.validateArrestRhythmMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrestRhythmCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ArrestRhythmOperations.validateArrestRhythmCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrestRhythmValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ArrestRhythmOperations.validateArrestRhythmValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrestRhythm init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ArrestRhythm init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // ArrestRhythmImpl
