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
import org.openhealthtools.mdht.uml.cda.emspcr.DestinationRhythm;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.DestinationRhythmOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Destination Rhythm</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DestinationRhythmImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements DestinationRhythm {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DestinationRhythmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.DESTINATION_RHYTHM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDestinationRhythmTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DestinationRhythmOperations.validateDestinationRhythmTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDestinationRhythmMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DestinationRhythmOperations.validateDestinationRhythmMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDestinationRhythmCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DestinationRhythmOperations.validateDestinationRhythmCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDestinationRhythmValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DestinationRhythmOperations.validateDestinationRhythmValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DestinationRhythm init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public DestinationRhythm init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // DestinationRhythmImpl
