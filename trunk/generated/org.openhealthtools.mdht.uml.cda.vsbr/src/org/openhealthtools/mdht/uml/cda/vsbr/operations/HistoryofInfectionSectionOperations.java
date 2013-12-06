/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.operations;

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

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

import org.openhealthtools.mdht.uml.cda.vsbr.HistoryofInfectionSection;
import org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresent;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Historyof Infection Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.HistoryofInfectionSection#validateHistoryofInfectionSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Historyof Infection Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.HistoryofInfectionSection#validateHistoryofInfectionSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Historyof Infection Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.HistoryofInfectionSection#validateHistoryofInfectionSectionInfectionsPresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Historyof Infection Section Infections Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.HistoryofInfectionSection#getInfectionsPresents() <em>Get Infections Presents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HistoryofInfectionSectionOperations extends SectionOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected HistoryofInfectionSectionOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateHistoryofInfectionSectionTemplateId(HistoryofInfectionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Historyof Infection Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateHistoryofInfectionSectionTemplateId(HistoryofInfectionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_HISTORYOF_INFECTION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.5')";

	/**
   * The cached OCL invariant for the '{@link #validateHistoryofInfectionSectionTemplateId(HistoryofInfectionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Historyof Infection Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateHistoryofInfectionSectionTemplateId(HistoryofInfectionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_HISTORYOF_INFECTION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param historyofInfectionSection The receiving '<em><b>Historyof Infection Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateHistoryofInfectionSectionTemplateId(
			HistoryofInfectionSection historyofInfectionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_HISTORYOF_INFECTION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.HISTORYOF_INFECTION_SECTION);
      try
      {
        VALIDATE_HISTORYOF_INFECTION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORYOF_INFECTION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HISTORYOF_INFECTION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyofInfectionSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.HISTORYOF_INFECTION_SECTION__HISTORYOF_INFECTION_SECTION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HistoryofInfectionSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(historyofInfectionSection, context) }),
             new Object [] { historyofInfectionSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateHistoryofInfectionSectionText(HistoryofInfectionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Historyof Infection Section Text</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateHistoryofInfectionSectionText(HistoryofInfectionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_HISTORYOF_INFECTION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
   * The cached OCL invariant for the '{@link #validateHistoryofInfectionSectionText(HistoryofInfectionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Historyof Infection Section Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateHistoryofInfectionSectionText(HistoryofInfectionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_HISTORYOF_INFECTION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param historyofInfectionSection The receiving '<em><b>Historyof Infection Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateHistoryofInfectionSectionText(HistoryofInfectionSection historyofInfectionSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_HISTORYOF_INFECTION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.HISTORYOF_INFECTION_SECTION);
      try
      {
        VALIDATE_HISTORYOF_INFECTION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORYOF_INFECTION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HISTORYOF_INFECTION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyofInfectionSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.HISTORYOF_INFECTION_SECTION__HISTORYOF_INFECTION_SECTION_TEXT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HistoryofInfectionSectionText", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(historyofInfectionSection, context) }),
             new Object [] { historyofInfectionSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateHistoryofInfectionSectionInfectionsPresent(HistoryofInfectionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Historyof Infection Section Infections Present</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateHistoryofInfectionSectionInfectionsPresent(HistoryofInfectionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_HISTORYOF_INFECTION_SECTION_INFECTIONS_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Infection Present) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
   * The cached OCL invariant for the '{@link #validateHistoryofInfectionSectionInfectionsPresent(HistoryofInfectionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Historyof Infection Section Infections Present</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateHistoryofInfectionSectionInfectionsPresent(HistoryofInfectionSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_HISTORYOF_INFECTION_SECTION_INFECTIONS_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param historyofInfectionSection The receiving '<em><b>Historyof Infection Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateHistoryofInfectionSectionInfectionsPresent(
			HistoryofInfectionSection historyofInfectionSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_HISTORYOF_INFECTION_SECTION_INFECTIONS_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.HISTORYOF_INFECTION_SECTION);
      try
      {
        VALIDATE_HISTORYOF_INFECTION_SECTION_INFECTIONS_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORYOF_INFECTION_SECTION_INFECTIONS_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HISTORYOF_INFECTION_SECTION_INFECTIONS_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyofInfectionSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.HISTORYOF_INFECTION_SECTION__HISTORYOF_INFECTION_SECTION_INFECTIONS_PRESENT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HistoryofInfectionSectionInfectionsPresent", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(historyofInfectionSection, context) }),
             new Object [] { historyofInfectionSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getInfectionsPresents(HistoryofInfectionSection) <em>Get Infections Presents</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInfectionsPresents(HistoryofInfectionSection)
   * @generated
   * @ordered
   */
	protected static final String GET_INFECTIONS_PRESENTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Infection Present)).oclAsType(vsbr::Infection Present)";

	/**
   * The cached OCL query for the '{@link #getInfectionsPresents(HistoryofInfectionSection) <em>Get Infections Presents</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getInfectionsPresents(HistoryofInfectionSection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_INFECTIONS_PRESENTS__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */

	public static EList<InfectionPresent> getInfectionsPresents(HistoryofInfectionSection historyofInfectionSection) {
    if (GET_INFECTIONS_PRESENTS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.HISTORYOF_INFECTION_SECTION, VsbrPackage.Literals.HISTORYOF_INFECTION_SECTION.getEAllOperations().get(58));
      try
      {
        GET_INFECTIONS_PRESENTS__EOCL_QRY = helper.createQuery(GET_INFECTIONS_PRESENTS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_INFECTIONS_PRESENTS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<InfectionPresent> result = (Collection<InfectionPresent>) query.evaluate(historyofInfectionSection);
    return new BasicEList.UnmodifiableEList<InfectionPresent>(result.size(), result.toArray());
  }

} // HistoryofInfectionSectionOperations
