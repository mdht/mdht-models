/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.toc.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.openhealthtools.mdht.uml.cda.toc.ConsultationRequest;
import org.openhealthtools.mdht.uml.cda.toc.ConsultationSummary;
import org.openhealthtools.mdht.uml.cda.toc.DischargeInstructions;
import org.openhealthtools.mdht.uml.cda.toc.DischargeSummary;
import org.openhealthtools.mdht.uml.cda.toc.ToCFactory;
import org.openhealthtools.mdht.uml.cda.toc.ToCPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ToCFactoryImpl extends EFactoryImpl implements ToCFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ToCFactory init() {
		try {
			ToCFactory theToCFactory = (ToCFactory) EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/toc");
			if (theToCFactory != null) {
				return theToCFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ToCFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToCFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ToCPackage.DISCHARGE_SUMMARY:
				return createDischargeSummary();
			case ToCPackage.DISCHARGE_INSTRUCTIONS:
				return createDischargeInstructions();
			case ToCPackage.CONSULTATION_SUMMARY:
				return createConsultationSummary();
			case ToCPackage.CONSULTATION_REQUEST:
				return createConsultationRequest();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DischargeSummary createDischargeSummary() {
		DischargeSummaryImpl dischargeSummary = new DischargeSummaryImpl();
		return dischargeSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DischargeInstructions createDischargeInstructions() {
		DischargeInstructionsImpl dischargeInstructions = new DischargeInstructionsImpl();
		return dischargeInstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsultationSummary createConsultationSummary() {
		ConsultationSummaryImpl consultationSummary = new ConsultationSummaryImpl();
		return consultationSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsultationRequest createConsultationRequest() {
		ConsultationRequestImpl consultationRequest = new ConsultationRequestImpl();
		return consultationRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToCPackage getToCPackage() {
		return (ToCPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ToCPackage getPackage() {
		return ToCPackage.eINSTANCE;
	}

} // ToCFactoryImpl
