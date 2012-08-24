/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.BodyWeight;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.ExclusionReason;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.BodyWeightOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body Weight</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BodyWeightImpl extends ObservationImpl implements BodyWeight
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BodyWeightImpl()
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
    return SdtmPackage.Literals.BODY_WEIGHT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBodyWeightTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BodyWeightOperations.validateBodyWeightTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBodyWeightClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BodyWeightOperations.validateBodyWeightClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBodyWeightCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BodyWeightOperations.validateBodyWeightCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBodyWeightCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BodyWeightOperations.validateBodyWeightCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBodyWeightId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BodyWeightOperations.validateBodyWeightId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBodyWeightMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BodyWeightOperations.validateBodyWeightMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBodyWeightValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BodyWeightOperations.validateBodyWeightValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBodyWeightStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BodyWeightOperations.validateBodyWeightStatusCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBodyWeightInterpretationCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BodyWeightOperations.validateBodyWeightInterpretationCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBodyWeightNonPerformanceReason(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BodyWeightOperations.validateBodyWeightNonPerformanceReason(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBodyWeightFastingAssociation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BodyWeightOperations.validateBodyWeightFastingAssociation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBodyWeightDataCollection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BodyWeightOperations.validateBodyWeightDataCollection(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBodyWeightExclusionReason(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BodyWeightOperations.validateBodyWeightExclusionReason(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateBodyWeightfastingAssociationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return BodyWeightOperations.validateBodyWeightfastingAssociationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonPerformanceReason getNonPerformanceReason()
  {
    return BodyWeightOperations.getNonPerformanceReason(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataCollection getDataCollection()
  {
    return BodyWeightOperations.getDataCollection(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExclusionReason getExclusionReason()
  {
    return BodyWeightOperations.getExclusionReason(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BodyWeight init() {
      return Initializer.Util.init(this);
  }

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BodyWeight init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //BodyWeightImpl
