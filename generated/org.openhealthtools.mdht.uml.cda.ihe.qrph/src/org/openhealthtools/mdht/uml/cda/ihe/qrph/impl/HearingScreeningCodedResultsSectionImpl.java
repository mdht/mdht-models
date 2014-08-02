/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.ihe.ExternalReference;
import org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntry;
import org.openhealthtools.mdht.uml.cda.ihe.SimpleObservation;

import org.openhealthtools.mdht.uml.cda.ihe.impl.CodedResultsSectionImpl;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.HearingScreeningCodedResultsSection;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.QrphPackage;

import org.openhealthtools.mdht.uml.cda.ihe.qrph.operations.HearingScreeningCodedResultsSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hearing Screening Coded Results Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HearingScreeningCodedResultsSectionImpl extends CodedResultsSectionImpl implements HearingScreeningCodedResultsSection
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HearingScreeningCodedResultsSectionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return QrphPackage.Literals.HEARING_SCREENING_CODED_RESULTS_SECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
public ProcedureEntry getQrphProcedureEntry()
  {
    return HearingScreeningCodedResultsSectionOperations.getQrphProcedureEntry(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
public ExternalReference getQrphExternalReference()
  {
    return HearingScreeningCodedResultsSectionOperations.getQrphExternalReference(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
public SimpleObservation getQrphSimpleObservation()
  {
    return HearingScreeningCodedResultsSectionOperations.getQrphSimpleObservation(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean validateCodedResultsSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return HearingScreeningCodedResultsSectionOperations.validateCodedResultsSectionTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
public HearingScreeningCodedResultsSection init() {
      return Initializer.Util.init(this);
  }
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public HearingScreeningCodedResultsSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //HearingScreeningCodedResultsSectionImpl
