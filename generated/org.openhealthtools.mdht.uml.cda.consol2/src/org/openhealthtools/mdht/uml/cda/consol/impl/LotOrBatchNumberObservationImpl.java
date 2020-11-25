/**
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.LotOrBatchNumberObservation;

import org.openhealthtools.mdht.uml.cda.consol.operations.LotOrBatchNumberObservationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lot Or Batch Number Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LotOrBatchNumberObservationImpl extends ObservationImpl implements LotOrBatchNumberObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LotOrBatchNumberObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.LOT_OR_BATCH_NUMBER_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLotOrBatchNumberObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LotOrBatchNumberObservationOperations.validateLotOrBatchNumberObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLotOrBatchNumberObservationCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LotOrBatchNumberObservationOperations.validateLotOrBatchNumberObservationCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLotOrBatchNumberObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LotOrBatchNumberObservationOperations.validateLotOrBatchNumberObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLotOrBatchNumberObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return LotOrBatchNumberObservationOperations.validateLotOrBatchNumberObservationValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LotOrBatchNumberObservation init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LotOrBatchNumberObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }

} //LotOrBatchNumberObservationImpl
