/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

import org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.PlannedStudyDayOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planned Study Day</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PlannedStudyDayImpl extends ObservationImpl implements PlannedStudyDay
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PlannedStudyDayImpl()
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
    return SdtmPackage.Literals.PLANNED_STUDY_DAY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePlannedStudyDayTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PlannedStudyDayOperations.validatePlannedStudyDayTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePlannedStudyDayClassCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PlannedStudyDayOperations.validatePlannedStudyDayClassCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePlannedStudyDayCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PlannedStudyDayOperations.validatePlannedStudyDayCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePlannedStudyDayCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PlannedStudyDayOperations.validatePlannedStudyDayCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePlannedStudyDayMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PlannedStudyDayOperations.validatePlannedStudyDayMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePlannedStudyDayValue(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PlannedStudyDayOperations.validatePlannedStudyDayValue(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlannedStudyDay init() {
    	CDAUtil.init(this);
    	return this;
  }
} //PlannedStudyDayImpl
