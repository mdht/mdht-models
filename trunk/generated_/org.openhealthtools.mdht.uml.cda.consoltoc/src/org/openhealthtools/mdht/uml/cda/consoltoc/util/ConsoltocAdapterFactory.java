/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consoltoc.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.ClinicalDocument;

import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints;

import org.openhealthtools.mdht.uml.cda.consoltoc.*;

import org.openhealthtools.mdht.uml.hl7.rim.Act;
import org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.consoltoc.ConsoltocPackage
 * @generated
 */
public class ConsoltocAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static ConsoltocPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ConsoltocAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = ConsoltocPackage.eINSTANCE;
		}
	}

  /**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
  @Override
  public boolean isFactoryForType(Object object)
  {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

  /**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ConsoltocSwitch<Adapter> modelSwitch =
    new ConsoltocSwitch<Adapter>() {
			@Override
			public Adapter caseDischargeSummary(DischargeSummary object) {
				return createDischargeSummaryAdapter();
			}
			@Override
			public Adapter caseConsultationRequest(ConsultationRequest object) {
				return createConsultationRequestAdapter();
			}
			@Override
			public Adapter caseConsultationSummary(ConsultationSummary object) {
				return createConsultationSummaryAdapter();
			}
			@Override
			public Adapter caseDischargeInstructions(DischargeInstructions object) {
				return createDischargeInstructionsAdapter();
			}
			@Override
			public Adapter caseInfrastructureRoot(InfrastructureRoot object) {
				return createInfrastructureRootAdapter();
			}
			@Override
			public Adapter caseAct(Act object) {
				return createActAdapter();
			}
			@Override
			public Adapter caseClinicalDocument(ClinicalDocument object) {
				return createClinicalDocumentAdapter();
			}
			@Override
			public Adapter caseGeneralHeaderConstraints(GeneralHeaderConstraints object) {
				return createGeneralHeaderConstraintsAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

  /**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
  @Override
  public Adapter createAdapter(Notifier target)
  {
		return modelSwitch.doSwitch((EObject)target);
	}


  /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary <em>Discharge Summary</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consoltoc.DischargeSummary
	 * @generated
	 */
  public Adapter createDischargeSummaryAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest <em>Consultation Request</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationRequest
	 * @generated
	 */
  public Adapter createConsultationRequestAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary <em>Consultation Summary</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consoltoc.ConsultationSummary
	 * @generated
	 */
  public Adapter createConsultationSummaryAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions <em>Discharge Instructions</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions
	 * @generated
	 */
  public Adapter createDischargeInstructionsAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot <em>Infrastructure Root</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot
	 * @generated
	 */
  public Adapter createInfrastructureRootAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.hl7.rim.Act <em>Act</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.Act
	 * @generated
	 */
  public Adapter createActAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument <em>Clinical Document</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument
	 * @generated
	 */
  public Adapter createClinicalDocumentAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints <em>General Header Constraints</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints
	 * @generated
	 */
  public Adapter createGeneralHeaderConstraintsAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
  public Adapter createEObjectAdapter()
  {
		return null;
	}

} //ConsoltocAdapterFactory
