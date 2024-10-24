/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.qrda.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.openhealthtools.mdht.uml.cda.qrda.MeasureSection;
import org.openhealthtools.mdht.uml.cda.qrda.QRDAFactory;
import org.openhealthtools.mdht.uml.cda.qrda.QRDAPackage;
import org.openhealthtools.mdht.uml.cda.qrda.QualityReportingDocumentArchitectureDocument;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QRDAFactoryImpl extends EFactoryImpl implements QRDAFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QRDAFactory init() {
		try {
			QRDAFactory theQRDAFactory = (QRDAFactory)EPackage.Registry.INSTANCE.getEFactory(QRDAPackage.eNS_URI);
			if (theQRDAFactory != null) {
				return theQRDAFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QRDAFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QRDAFactoryImpl() {
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
			case QRDAPackage.QUALITY_REPORTING_DOCUMENT_ARCHITECTURE_DOCUMENT: return createQualityReportingDocumentArchitectureDocument();
			case QRDAPackage.MEASURE_SECTION: return createMeasureSection();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QualityReportingDocumentArchitectureDocument createQualityReportingDocumentArchitectureDocument() {
		QualityReportingDocumentArchitectureDocumentImpl qualityReportingDocumentArchitectureDocument = new QualityReportingDocumentArchitectureDocumentImpl();
		return qualityReportingDocumentArchitectureDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureSection createMeasureSection() {
		MeasureSectionImpl measureSection = new MeasureSectionImpl();
		return measureSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QRDAPackage getQRDAPackage() {
		return (QRDAPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QRDAPackage getPackage() {
		return QRDAPackage.eINSTANCE;
	}

} //QRDAFactoryImpl
