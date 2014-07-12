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

import org.openhealthtools.mdht.uml.cda.vsbr.HistoryofInfectionFetalDeathSection;
import org.openhealthtools.mdht.uml.cda.vsbr.InfectionPresentFetalDeath;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Historyof Infection Fetal Death Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.HistoryofInfectionFetalDeathSection#validateHistoryofInfectionFetalDeathSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Historyof Infection Fetal Death Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.HistoryofInfectionFetalDeathSection#validateHistoryofInfectionFetalDeathSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Historyof Infection Fetal Death Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.HistoryofInfectionFetalDeathSection#validateHistoryofInfectionFetalDeathSectionInfectionPresentFetalDeath(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Historyof Infection Fetal Death Section Infection Present Fetal Death</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.HistoryofInfectionFetalDeathSection#getInfectionPresentFetalDeaths() <em>Get Infection Present Fetal Deaths</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HistoryofInfectionFetalDeathSectionOperations extends SectionOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HistoryofInfectionFetalDeathSectionOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateHistoryofInfectionFetalDeathSectionTemplateId(HistoryofInfectionFetalDeathSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Historyof Infection Fetal Death Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHistoryofInfectionFetalDeathSectionTemplateId(HistoryofInfectionFetalDeathSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HISTORYOF_INFECTION_FETAL_DEATH_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.48')";

  /**
   * The cached OCL invariant for the '{@link #validateHistoryofInfectionFetalDeathSectionTemplateId(HistoryofInfectionFetalDeathSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Historyof Infection Fetal Death Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHistoryofInfectionFetalDeathSectionTemplateId(HistoryofInfectionFetalDeathSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HISTORYOF_INFECTION_FETAL_DEATH_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param historyofInfectionFetalDeathSection The receiving '<em><b>Historyof Infection Fetal Death Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHistoryofInfectionFetalDeathSectionTemplateId(HistoryofInfectionFetalDeathSection historyofInfectionFetalDeathSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HISTORYOF_INFECTION_FETAL_DEATH_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.HISTORYOF_INFECTION_FETAL_DEATH_SECTION);
      try
      {
        VALIDATE_HISTORYOF_INFECTION_FETAL_DEATH_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORYOF_INFECTION_FETAL_DEATH_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HISTORYOF_INFECTION_FETAL_DEATH_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyofInfectionFetalDeathSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.HISTORYOF_INFECTION_FETAL_DEATH_SECTION__HISTORYOF_INFECTION_FETAL_DEATH_SECTION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HistoryofInfectionFetalDeathSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(historyofInfectionFetalDeathSection, context) }),
             new Object [] { historyofInfectionFetalDeathSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHistoryofInfectionFetalDeathSectionCode(HistoryofInfectionFetalDeathSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Historyof Infection Fetal Death Section Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHistoryofInfectionFetalDeathSectionCode(HistoryofInfectionFetalDeathSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HISTORYOF_INFECTION_FETAL_DEATH_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '71459-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

  /**
   * The cached OCL invariant for the '{@link #validateHistoryofInfectionFetalDeathSectionCode(HistoryofInfectionFetalDeathSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Historyof Infection Fetal Death Section Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHistoryofInfectionFetalDeathSectionCode(HistoryofInfectionFetalDeathSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HISTORYOF_INFECTION_FETAL_DEATH_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param historyofInfectionFetalDeathSection The receiving '<em><b>Historyof Infection Fetal Death Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHistoryofInfectionFetalDeathSectionCode(HistoryofInfectionFetalDeathSection historyofInfectionFetalDeathSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HISTORYOF_INFECTION_FETAL_DEATH_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.HISTORYOF_INFECTION_FETAL_DEATH_SECTION);
      try
      {
        VALIDATE_HISTORYOF_INFECTION_FETAL_DEATH_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORYOF_INFECTION_FETAL_DEATH_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HISTORYOF_INFECTION_FETAL_DEATH_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyofInfectionFetalDeathSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.HISTORYOF_INFECTION_FETAL_DEATH_SECTION__HISTORYOF_INFECTION_FETAL_DEATH_SECTION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HistoryofInfectionFetalDeathSectionCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(historyofInfectionFetalDeathSection, context) }),
             new Object [] { historyofInfectionFetalDeathSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHistoryofInfectionFetalDeathSectionInfectionPresentFetalDeath(HistoryofInfectionFetalDeathSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Historyof Infection Fetal Death Section Infection Present Fetal Death</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHistoryofInfectionFetalDeathSectionInfectionPresentFetalDeath(HistoryofInfectionFetalDeathSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HISTORYOF_INFECTION_FETAL_DEATH_SECTION_INFECTION_PRESENT_FETAL_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Infection Present: Fetal Death))";

  /**
   * The cached OCL invariant for the '{@link #validateHistoryofInfectionFetalDeathSectionInfectionPresentFetalDeath(HistoryofInfectionFetalDeathSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Historyof Infection Fetal Death Section Infection Present Fetal Death</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHistoryofInfectionFetalDeathSectionInfectionPresentFetalDeath(HistoryofInfectionFetalDeathSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HISTORYOF_INFECTION_FETAL_DEATH_SECTION_INFECTION_PRESENT_FETAL_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param historyofInfectionFetalDeathSection The receiving '<em><b>Historyof Infection Fetal Death Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHistoryofInfectionFetalDeathSectionInfectionPresentFetalDeath(HistoryofInfectionFetalDeathSection historyofInfectionFetalDeathSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_HISTORYOF_INFECTION_FETAL_DEATH_SECTION_INFECTION_PRESENT_FETAL_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.HISTORYOF_INFECTION_FETAL_DEATH_SECTION);
      try
      {
        VALIDATE_HISTORYOF_INFECTION_FETAL_DEATH_SECTION_INFECTION_PRESENT_FETAL_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORYOF_INFECTION_FETAL_DEATH_SECTION_INFECTION_PRESENT_FETAL_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HISTORYOF_INFECTION_FETAL_DEATH_SECTION_INFECTION_PRESENT_FETAL_DEATH__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyofInfectionFetalDeathSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.HISTORYOF_INFECTION_FETAL_DEATH_SECTION__HISTORYOF_INFECTION_FETAL_DEATH_SECTION_INFECTION_PRESENT_FETAL_DEATH,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HistoryofInfectionFetalDeathSectionInfectionPresentFetalDeath", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(historyofInfectionFetalDeathSection, context) }),
             new Object [] { historyofInfectionFetalDeathSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getInfectionPresentFetalDeaths(HistoryofInfectionFetalDeathSection) <em>Get Infection Present Fetal Deaths</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInfectionPresentFetalDeaths(HistoryofInfectionFetalDeathSection)
   * @generated
   * @ordered
   */
  protected static final String GET_INFECTION_PRESENT_FETAL_DEATHS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Infection Present: Fetal Death)).oclAsType(vsbr::Infection Present: Fetal Death)";

  /**
   * The cached OCL query for the '{@link #getInfectionPresentFetalDeaths(HistoryofInfectionFetalDeathSection) <em>Get Infection Present Fetal Deaths</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInfectionPresentFetalDeaths(HistoryofInfectionFetalDeathSection)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_INFECTION_PRESENT_FETAL_DEATHS__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  
  public static  EList<InfectionPresentFetalDeath> getInfectionPresentFetalDeaths(HistoryofInfectionFetalDeathSection historyofInfectionFetalDeathSection)
  {
    if (GET_INFECTION_PRESENT_FETAL_DEATHS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.HISTORYOF_INFECTION_FETAL_DEATH_SECTION, VsbrPackage.Literals.HISTORYOF_INFECTION_FETAL_DEATH_SECTION.getEAllOperations().get(58));
      try
      {
        GET_INFECTION_PRESENT_FETAL_DEATHS__EOCL_QRY = helper.createQuery(GET_INFECTION_PRESENT_FETAL_DEATHS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_INFECTION_PRESENT_FETAL_DEATHS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<InfectionPresentFetalDeath> result = (Collection<InfectionPresentFetalDeath>) query.evaluate(historyofInfectionFetalDeathSection);
    return new BasicEList.UnmodifiableEList<InfectionPresentFetalDeath>(result.size(), result.toArray());
  }

} // HistoryofInfectionFetalDeathSectionOperations