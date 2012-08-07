/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openhealthtools.mdht.uml.cda.mu2consol.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Mu2consolFactoryImpl extends EFactoryImpl implements Mu2consolFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Mu2consolFactory init() {
		try {
			Mu2consolFactory theMu2consolFactory = (Mu2consolFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/mu2consol"); 
			if (theMu2consolFactory != null) {
				return theMu2consolFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Mu2consolFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mu2consolFactoryImpl() {
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
			case Mu2consolPackage.GENERAL_HEADER_CONSTRAINTS: return createGeneralHeaderConstraints();
			case Mu2consolPackage.SUMMARY_OF_CARE_RECORD: return createSummaryOfCareRecord();
			case Mu2consolPackage.VDT_AMBULATORY_PATIENT_INFO: return createVDTAmbulatoryPatientInfo();
			case Mu2consolPackage.CREATE_TRANSMIT_SUMMARY_OF_CARE_RECORD: return createCreateTransmitSummaryOfCareRecord();
			case Mu2consolPackage.VDT_INPATIENT_PATIENT_INFO: return createVDTInpatientPatientInfo();
			case Mu2consolPackage.CLINICAL_OFFICE_VISIT_SUMMARY: return createClinicalOfficeVisitSummary();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralHeaderConstraints createGeneralHeaderConstraints() {
		GeneralHeaderConstraintsImpl generalHeaderConstraints = new GeneralHeaderConstraintsImpl();
		return generalHeaderConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SummaryOfCareRecord createSummaryOfCareRecord() {
		SummaryOfCareRecordImpl summaryOfCareRecord = new SummaryOfCareRecordImpl();
		return summaryOfCareRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VDTAmbulatoryPatientInfo createVDTAmbulatoryPatientInfo() {
		VDTAmbulatoryPatientInfoImpl vdtAmbulatoryPatientInfo = new VDTAmbulatoryPatientInfoImpl();
		return vdtAmbulatoryPatientInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalOfficeVisitSummary createClinicalOfficeVisitSummary() {
		ClinicalOfficeVisitSummaryImpl clinicalOfficeVisitSummary = new ClinicalOfficeVisitSummaryImpl();
		return clinicalOfficeVisitSummary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VDTInpatientPatientInfo createVDTInpatientPatientInfo() {
		VDTInpatientPatientInfoImpl vdtInpatientPatientInfo = new VDTInpatientPatientInfoImpl();
		return vdtInpatientPatientInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateTransmitSummaryOfCareRecord createCreateTransmitSummaryOfCareRecord() {
		CreateTransmitSummaryOfCareRecordImpl createTransmitSummaryOfCareRecord = new CreateTransmitSummaryOfCareRecordImpl();
		return createTransmitSummaryOfCareRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mu2consolPackage getMu2consolPackage() {
		return (Mu2consolPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Mu2consolPackage getPackage() {
		return Mu2consolPackage.eINSTANCE;
	}

} //Mu2consolFactoryImpl
