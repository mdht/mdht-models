/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.openhealthtools.mdht.uml.cda.Participant1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Study Test Performer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage#getStudyTestPerformer()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='2.16.840.1.113883.10.20.23.73' constraints.validation.error='Study Test PerformerTemplateId Study Test PerformerTypeCode' typeCode='AUT'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmStudyTestPerformerroleOfPerformer templateId.root='null' constraints.validation.error='roleOfPerformerTemplateId roleOfPerformerClassCode roleOfPerformerperformerClassCode roleOfPerformerperformerDeterminerCode roleOfPerformerperformerName' classCode='ASSIGNED' constraints.validation.query='roleOfPerformerperformerClassCode roleOfPerformerperformerDeterminerCode roleOfPerformerperformerName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/sdtmStudyTestPerformerroleOfPerformerperformer constraints.validation.error='performerClassCode performerDeterminerCode performerName' determinerCode='INSTANCE' classCode='ORG'"
 * @generated
 */
public interface StudyTestPerformer extends Participant1
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.73')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.23.73\')'"
   * @generated
   */
  boolean validateStudyTestPerformerTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.typeCode=vocab::ParticipationType::AUT
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.typeCode=vocab::ParticipationType::AUT'"
   * @generated
   */
  boolean validateStudyTestPerformerTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StudyTestPerformer init();
} // StudyTestPerformer
