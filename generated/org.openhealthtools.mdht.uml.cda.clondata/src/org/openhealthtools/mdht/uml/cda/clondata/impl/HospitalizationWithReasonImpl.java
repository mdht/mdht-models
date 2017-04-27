/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.EncounterImpl;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.HospitalizationWithReason;
import org.openhealthtools.mdht.uml.cda.clondata.operations.HospitalizationWithReasonOperations;
import org.openhealthtools.mdht.uml.cda.consol.Indication;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hospitalization With Reason</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HospitalizationWithReasonImpl extends EncounterImpl implements HospitalizationWithReason {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HospitalizationWithReasonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CLONDATAPackage.eINSTANCE.getHospitalizationWithReason();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalizationWithReasonTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HospitalizationWithReasonOperations.validateHospitalizationWithReasonTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalizationWithReasonCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HospitalizationWithReasonOperations.validateHospitalizationWithReasonCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHospitalizationWithReasonIndication(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return HospitalizationWithReasonOperations.validateHospitalizationWithReasonIndication(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Indication getIndication() {
		return HospitalizationWithReasonOperations.getIndication(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalizationWithReason init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalizationWithReason init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // HospitalizationWithReasonImpl
