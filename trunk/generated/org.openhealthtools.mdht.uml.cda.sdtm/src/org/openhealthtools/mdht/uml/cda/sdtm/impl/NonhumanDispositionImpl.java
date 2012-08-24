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

import org.openhealthtools.mdht.uml.cda.impl.ActImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.NonhumanDisposition;
import org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.NonhumanDispositionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nonhuman Disposition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NonhumanDispositionImpl extends ActImpl implements NonhumanDisposition
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NonhumanDispositionImpl()
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
    return SdtmPackage.Literals.NONHUMAN_DISPOSITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanDispositionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanDispositionOperations.validateNonhumanDispositionTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanDispositionClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanDispositionOperations.validateNonhumanDispositionClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanDispositionCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanDispositionOperations.validateNonhumanDispositionCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanDispositionEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanDispositionOperations.validateNonhumanDispositionEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanDispositionId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanDispositionOperations.validateNonhumanDispositionId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanDispositionMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanDispositionOperations.validateNonhumanDispositionMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanDispositionStudyDayPeriod(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanDispositionOperations.validateNonhumanDispositionStudyDayPeriod(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateNonhumanDispositionPlannedStudyDay(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return NonhumanDispositionOperations.validateNonhumanDispositionPlannedStudyDay(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StudyDayPeriod getStudyDayPeriod()
  {
    return NonhumanDispositionOperations.getStudyDayPeriod(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlannedStudyDay getPlannedStudyDay()
  {
    return NonhumanDispositionOperations.getPlannedStudyDay(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NonhumanDisposition init() {
      return Initializer.Util.init(this);
  }
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NonhumanDisposition init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //NonhumanDispositionImpl
