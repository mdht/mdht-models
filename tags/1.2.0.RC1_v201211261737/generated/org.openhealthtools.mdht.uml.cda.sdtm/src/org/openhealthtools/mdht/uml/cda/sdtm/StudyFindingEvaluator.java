/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.Participant1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Study Finding Evaluator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage#getStudyFindingEvaluator()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Study Finding EvaluatorTemplateId Study Finding EvaluatorTypeCode' templateId.root='2.16.840.1.113883.10.20.23.72' typeCode='PRF'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmStudyFindingEvaluatorroleOfEvaluator constraints.validation.error='roleOfEvaluatorTemplateId roleOfEvaluatorClassCode roleOfEvaluatorCode' templateId.root='null' classCode='ASSIGNED'"
 * @generated
 */
public interface StudyFindingEvaluator extends Participant1
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.23.72\')'"
   * @generated
   */
  boolean validateStudyFindingEvaluatorTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.typeCode=vocab::ParticipationType::PRF'"
   * @generated
   */
  boolean validateStudyFindingEvaluatorTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StudyFindingEvaluator init();

  /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StudyFindingEvaluator init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // StudyFindingEvaluator
