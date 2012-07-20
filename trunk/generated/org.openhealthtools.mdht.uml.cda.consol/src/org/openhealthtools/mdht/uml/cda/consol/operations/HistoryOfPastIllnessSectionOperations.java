/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>History Of Past Illness Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection#validateHistoryOfPastIllnessSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection#validateHistoryOfPastIllnessSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection#validateHistoryOfPastIllnessSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection#validateHistoryOfPastIllnessSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection#validateHistoryOfPastIllnessSectionProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryOfPastIllnessSection#getProblemObservations() <em>Get Problem Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HistoryOfPastIllnessSectionOperations extends SectionOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected HistoryOfPastIllnessSectionOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateHistoryOfPastIllnessSectionTemplateId(HistoryOfPastIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateHistoryOfPastIllnessSectionTemplateId(HistoryOfPastIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.20')";

	/**
   * The cached OCL invariant for the '{@link #validateHistoryOfPastIllnessSectionTemplateId(HistoryOfPastIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateHistoryOfPastIllnessSectionTemplateId(HistoryOfPastIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.20')
   * @param historyOfPastIllnessSection The receiving '<em><b>History Of Past Illness Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateHistoryOfPastIllnessSectionTemplateId(
			HistoryOfPastIllnessSection historyOfPastIllnessSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(ConsolPackage.Literals.HISTORY_OF_PAST_ILLNESS_SECTION);
      try
      {
        VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyOfPastIllnessSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             ConsolValidator.DIAGNOSTIC_SOURCE,
             ConsolValidator.HISTORY_OF_PAST_ILLNESS_SECTION__HISTORY_OF_PAST_ILLNESS_SECTION_TEMPLATE_ID,
             ConsolPlugin.INSTANCE.getString("HistoryOfPastIllnessSectionTemplateId"),
             new Object [] { historyOfPastIllnessSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateHistoryOfPastIllnessSectionCode(HistoryOfPastIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateHistoryOfPastIllnessSectionCode(HistoryOfPastIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '11348-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
   * The cached OCL invariant for the '{@link #validateHistoryOfPastIllnessSectionCode(HistoryOfPastIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateHistoryOfPastIllnessSectionCode(HistoryOfPastIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
   * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
   * value.code = '11348-0' and value.codeSystem = '2.16.840.1.113883.6.1')
   * @param historyOfPastIllnessSection The receiving '<em><b>History Of Past Illness Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateHistoryOfPastIllnessSectionCode(
			HistoryOfPastIllnessSection historyOfPastIllnessSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(ConsolPackage.Literals.HISTORY_OF_PAST_ILLNESS_SECTION);
      try
      {
        VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyOfPastIllnessSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             ConsolValidator.DIAGNOSTIC_SOURCE,
             ConsolValidator.HISTORY_OF_PAST_ILLNESS_SECTION__HISTORY_OF_PAST_ILLNESS_SECTION_CODE,
             ConsolPlugin.INSTANCE.getString("HistoryOfPastIllnessSectionCode"),
             new Object [] { historyOfPastIllnessSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateHistoryOfPastIllnessSectionTitle(HistoryOfPastIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Title</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateHistoryOfPastIllnessSectionTitle(HistoryOfPastIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validateHistoryOfPastIllnessSectionTitle(HistoryOfPastIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Title</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateHistoryOfPastIllnessSectionTitle(HistoryOfPastIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())
   * @param historyOfPastIllnessSection The receiving '<em><b>History Of Past Illness Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateHistoryOfPastIllnessSectionTitle(
			HistoryOfPastIllnessSection historyOfPastIllnessSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(ConsolPackage.Literals.HISTORY_OF_PAST_ILLNESS_SECTION);
      try
      {
        VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyOfPastIllnessSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             ConsolValidator.DIAGNOSTIC_SOURCE,
             ConsolValidator.HISTORY_OF_PAST_ILLNESS_SECTION__HISTORY_OF_PAST_ILLNESS_SECTION_TITLE,
             ConsolPlugin.INSTANCE.getString("HistoryOfPastIllnessSectionTitle"),
             new Object [] { historyOfPastIllnessSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateHistoryOfPastIllnessSectionText(HistoryOfPastIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Text</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateHistoryOfPastIllnessSectionText(HistoryOfPastIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
   * The cached OCL invariant for the '{@link #validateHistoryOfPastIllnessSectionText(HistoryOfPastIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateHistoryOfPastIllnessSectionText(HistoryOfPastIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * not self.text.oclIsUndefined()
   * @param historyOfPastIllnessSection The receiving '<em><b>History Of Past Illness Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateHistoryOfPastIllnessSectionText(
			HistoryOfPastIllnessSection historyOfPastIllnessSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(ConsolPackage.Literals.HISTORY_OF_PAST_ILLNESS_SECTION);
      try
      {
        VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyOfPastIllnessSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             ConsolValidator.DIAGNOSTIC_SOURCE,
             ConsolValidator.HISTORY_OF_PAST_ILLNESS_SECTION__HISTORY_OF_PAST_ILLNESS_SECTION_TEXT,
             ConsolPlugin.INSTANCE.getString("HistoryOfPastIllnessSectionText"),
             new Object [] { historyOfPastIllnessSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateHistoryOfPastIllnessSectionProblemObservation(HistoryOfPastIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Problem Observation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateHistoryOfPastIllnessSectionProblemObservation(HistoryOfPastIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::ProblemObservation))";

	/**
   * The cached OCL invariant for the '{@link #validateHistoryOfPastIllnessSectionProblemObservation(HistoryOfPastIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Problem Observation</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateHistoryOfPastIllnessSectionProblemObservation(HistoryOfPastIllnessSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::ProblemObservation))
   * @param historyOfPastIllnessSection The receiving '<em><b>History Of Past Illness Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateHistoryOfPastIllnessSectionProblemObservation(
			HistoryOfPastIllnessSection historyOfPastIllnessSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(ConsolPackage.Literals.HISTORY_OF_PAST_ILLNESS_SECTION);
      try
      {
        VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyOfPastIllnessSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             ConsolValidator.DIAGNOSTIC_SOURCE,
             ConsolValidator.HISTORY_OF_PAST_ILLNESS_SECTION__HISTORY_OF_PAST_ILLNESS_SECTION_PROBLEM_OBSERVATION,
             ConsolPlugin.INSTANCE.getString("HistoryOfPastIllnessSectionProblemObservation"),
             new Object [] { historyOfPastIllnessSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getProblemObservations(HistoryOfPastIllnessSection) <em>Get Problem Observations</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getProblemObservations(HistoryOfPastIllnessSection)
   * @generated
   * @ordered
   */
	protected static final String GET_PROBLEM_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemObservation)).oclAsType(consol::ProblemObservation)";

	/**
   * The cached OCL query for the '{@link #getProblemObservations(HistoryOfPastIllnessSection) <em>Get Problem Observations</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getProblemObservations(HistoryOfPastIllnessSection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_PROBLEM_OBSERVATIONS__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProblemObservation)).oclAsType(consol::ProblemObservation)
   * @param historyOfPastIllnessSection The receiving '<em><b>History Of Past Illness Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
	public static EList<ProblemObservation> getProblemObservations(
			HistoryOfPastIllnessSection historyOfPastIllnessSection) {
    if (GET_PROBLEM_OBSERVATIONS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(ConsolPackage.Literals.HISTORY_OF_PAST_ILLNESS_SECTION, ConsolPackage.Literals.HISTORY_OF_PAST_ILLNESS_SECTION.getEAllOperations().get(60));
      try
      {
        GET_PROBLEM_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_PROBLEM_OBSERVATIONS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_OBSERVATIONS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<ProblemObservation> result = (Collection<ProblemObservation>) query.evaluate(historyOfPastIllnessSection);
    return new BasicEList.UnmodifiableEList<ProblemObservation>(result.size(), result.toArray());
  }

} // HistoryOfPastIllnessSectionOperations
