/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.EncountersSectionBCTPS;
import org.openhealthtools.mdht.uml.cda.clondata.HospitalizationWithReason;
import org.openhealthtools.mdht.uml.cda.clondata.operations.EncountersSectionBCTPSOperations;
import org.openhealthtools.mdht.uml.cda.consol.impl.EncountersSectionEntriesOptionalImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encounters Section BCTPS</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EncountersSectionBCTPSImpl extends EncountersSectionEntriesOptionalImpl implements EncountersSectionBCTPS {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncountersSectionBCTPSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CLONDATAPackage.eINSTANCE.getEncountersSectionBCTPS();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersSectionBCTPSHospitalizationWithReason(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EncountersSectionBCTPSOperations.validateEncountersSectionBCTPSHospitalizationWithReason(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HospitalizationWithReason getHospitalizationWithReason() {
		return EncountersSectionBCTPSOperations.getHospitalizationWithReason(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateEncountersSectionEntriesOptionalTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EncountersSectionBCTPSOperations.validateEncountersSectionEntriesOptionalTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncountersSectionBCTPS init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EncountersSectionBCTPS init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // EncountersSectionBCTPSImpl
