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

import org.openhealthtools.mdht.uml.cda.impl.Participant1Impl;

import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyTestOrganization;

import org.openhealthtools.mdht.uml.cda.sdtm.operations.StudyTestOrganizationOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Study Test Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class StudyTestOrganizationImpl extends Participant1Impl implements StudyTestOrganization
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StudyTestOrganizationImpl()
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
    return SdtmPackage.Literals.STUDY_TEST_ORGANIZATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudyTestOrganizationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudyTestOrganizationOperations.validateStudyTestOrganizationTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateStudyTestOrganizationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return StudyTestOrganizationOperations.validateStudyTestOrganizationTypeCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StudyTestOrganization init() {
      return Initializer.Util.init(this);
  }
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StudyTestOrganization init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //StudyTestOrganizationImpl
