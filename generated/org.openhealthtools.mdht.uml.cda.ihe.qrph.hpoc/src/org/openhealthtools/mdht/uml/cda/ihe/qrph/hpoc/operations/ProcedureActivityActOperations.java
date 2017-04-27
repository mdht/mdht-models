/**
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPackage;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProcedureActivityAct;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.util.HPOCValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Activity Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProcedureActivityAct#validateProcedureActivityActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProcedureActivityAct#validateHPOCProcedureActivityActText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HPOC Procedure Activity Act Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProcedureActivityAct#validateProcedureActivityActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProcedureActivityAct#validateHPOCProcedureActivityActEntryRelationshipEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HPOC Procedure Activity Act Entry Relationship Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProcedureActivityAct#validateHPOCProcedureActivityActEntryRelationshipInstructions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HPOC Procedure Activity Act Entry Relationship Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProcedureActivityAct#validateHPOCProcedureActivityActEntryRelationshipIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HPOC Procedure Activity Act Entry Relationship Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProcedureActivityAct#validateHPOCProcedureActivityActEntryRelationshipMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HPOC Procedure Activity Act Entry Relationship Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProcedureActivityAct#validateHPOCProcedureActivityActEntryRelationshipProcedure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HPOC Procedure Activity Act Entry Relationship Procedure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcedureActivityActOperations
{
  /**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final ThreadLocal< OCL > EOCL_ENV = new ThreadLocal< OCL >() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};


		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ProcedureActivityActOperations() {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityAct The receiving '<em><b>Procedure Activity Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHPOCProcedureActivityActText(ProcedureActivityAct procedureActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HPOC_PROCEDURE_ACTIVITY_ACT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.PROCEDURE_ACTIVITY_ACT);
			try {
				VALIDATE_HPOC_PROCEDURE_ACTIVITY_ACT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HPOC_PROCEDURE_ACTIVITY_ACT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HPOC_PROCEDURE_ACTIVITY_ACT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(procedureActivityAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.PROCEDURE_ACTIVITY_ACT__HPOC_PROCEDURE_ACTIVITY_ACT_TEXT,
						 HPOCPlugin.INSTANCE.getString("ProcedureActivityActHPOCProcedureActivityActText"),
						 new Object [] { procedureActivityAct }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityAct The receiving '<em><b>Procedure Activity Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHPOCProcedureActivityActEntryRelationshipEncounter(ProcedureActivityAct procedureActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HPOC_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.PROCEDURE_ACTIVITY_ACT);
			try {
				VALIDATE_HPOC_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HPOC_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HPOC_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(procedureActivityAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.PROCEDURE_ACTIVITY_ACT__HPOC_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_ENCOUNTER,
						 HPOCPlugin.INSTANCE.getString("ProcedureActivityActHPOCProcedureActivityActEntryRelationshipEncounter"),
						 new Object [] { procedureActivityAct }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityAct The receiving '<em><b>Procedure Activity Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHPOCProcedureActivityActEntryRelationshipInstructions(ProcedureActivityAct procedureActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HPOC_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.PROCEDURE_ACTIVITY_ACT);
			try {
				VALIDATE_HPOC_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HPOC_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HPOC_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(procedureActivityAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.PROCEDURE_ACTIVITY_ACT__HPOC_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_INSTRUCTIONS,
						 HPOCPlugin.INSTANCE.getString("ProcedureActivityActHPOCProcedureActivityActEntryRelationshipInstructions"),
						 new Object [] { procedureActivityAct }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityAct The receiving '<em><b>Procedure Activity Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHPOCProcedureActivityActEntryRelationshipIndication(ProcedureActivityAct procedureActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HPOC_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.PROCEDURE_ACTIVITY_ACT);
			try {
				VALIDATE_HPOC_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HPOC_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HPOC_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(procedureActivityAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.PROCEDURE_ACTIVITY_ACT__HPOC_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_INDICATION,
						 HPOCPlugin.INSTANCE.getString("ProcedureActivityActHPOCProcedureActivityActEntryRelationshipIndication"),
						 new Object [] { procedureActivityAct }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityAct The receiving '<em><b>Procedure Activity Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHPOCProcedureActivityActEntryRelationshipMedication(ProcedureActivityAct procedureActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HPOC_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.PROCEDURE_ACTIVITY_ACT);
			try {
				VALIDATE_HPOC_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HPOC_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HPOC_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(procedureActivityAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.PROCEDURE_ACTIVITY_ACT__HPOC_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_MEDICATION,
						 HPOCPlugin.INSTANCE.getString("ProcedureActivityActHPOCProcedureActivityActEntryRelationshipMedication"),
						 new Object [] { procedureActivityAct }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityAct The receiving '<em><b>Procedure Activity Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHPOCProcedureActivityActEntryRelationshipProcedure(ProcedureActivityAct procedureActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HPOC_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.PROCEDURE_ACTIVITY_ACT);
			try {
				VALIDATE_HPOC_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HPOC_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HPOC_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(procedureActivityAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.PROCEDURE_ACTIVITY_ACT__HPOC_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_PROCEDURE,
						 HPOCPlugin.INSTANCE.getString("ProcedureActivityActHPOCProcedureActivityActEntryRelationshipProcedure"),
						 new Object [] { procedureActivityAct }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityActTemplateId(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActTemplateId(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_PROCEDURE_ACTIVITY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.7.3.1.1.26.2.4.19')";

  /**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityActTemplateId(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActTemplateId(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_PROCEDURE_ACTIVITY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

		/**
	 * The cached OCL expression body for the '{@link #validateHPOCProcedureActivityActText(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HPOC Procedure Activity Act Text</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHPOCProcedureActivityActText(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HPOC_PROCEDURE_ACTIVITY_ACT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

		/**
	 * The cached OCL invariant for the '{@link #validateHPOCProcedureActivityActText(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HPOC Procedure Activity Act Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHPOCProcedureActivityActText(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HPOC_PROCEDURE_ACTIVITY_ACT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
  

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityAct The receiving '<em><b>Procedure Activity Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateProcedureActivityActTemplateId(ProcedureActivityAct procedureActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PROCEDURE_ACTIVITY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.PROCEDURE_ACTIVITY_ACT);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PROCEDURE_ACTIVITY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(procedureActivityAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.PROCEDURE_ACTIVITY_ACT__PROCEDURE_ACTIVITY_ACT_TEMPLATE_ID,
						 HPOCPlugin.INSTANCE.getString("ProcedureActivityActProcedureActivityActTemplateId"),
						 new Object [] { procedureActivityAct }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateProcedureActivityActCode(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Code</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActCode(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_PROCEDURE_ACTIVITY_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
	 * The cached OCL invariant for the '{@link #validateProcedureActivityActCode(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateProcedureActivityActCode(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_PROCEDURE_ACTIVITY_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

		/**
	 * The cached OCL expression body for the '{@link #validateHPOCProcedureActivityActEntryRelationshipEncounter(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HPOC Procedure Activity Act Entry Relationship Encounter</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHPOCProcedureActivityActEntryRelationshipEncounter(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HPOC_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

		/**
	 * The cached OCL invariant for the '{@link #validateHPOCProcedureActivityActEntryRelationshipEncounter(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HPOC Procedure Activity Act Entry Relationship Encounter</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHPOCProcedureActivityActEntryRelationshipEncounter(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HPOC_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

		/**
	 * The cached OCL expression body for the '{@link #validateHPOCProcedureActivityActEntryRelationshipInstructions(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HPOC Procedure Activity Act Entry Relationship Instructions</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHPOCProcedureActivityActEntryRelationshipInstructions(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HPOC_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

		/**
	 * The cached OCL invariant for the '{@link #validateHPOCProcedureActivityActEntryRelationshipInstructions(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HPOC Procedure Activity Act Entry Relationship Instructions</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHPOCProcedureActivityActEntryRelationshipInstructions(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HPOC_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

		/**
	 * The cached OCL expression body for the '{@link #validateHPOCProcedureActivityActEntryRelationshipIndication(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HPOC Procedure Activity Act Entry Relationship Indication</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHPOCProcedureActivityActEntryRelationshipIndication(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HPOC_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

		/**
	 * The cached OCL invariant for the '{@link #validateHPOCProcedureActivityActEntryRelationshipIndication(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HPOC Procedure Activity Act Entry Relationship Indication</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHPOCProcedureActivityActEntryRelationshipIndication(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HPOC_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

		/**
	 * The cached OCL expression body for the '{@link #validateHPOCProcedureActivityActEntryRelationshipMedication(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HPOC Procedure Activity Act Entry Relationship Medication</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHPOCProcedureActivityActEntryRelationshipMedication(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HPOC_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

		/**
	 * The cached OCL invariant for the '{@link #validateHPOCProcedureActivityActEntryRelationshipMedication(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HPOC Procedure Activity Act Entry Relationship Medication</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHPOCProcedureActivityActEntryRelationshipMedication(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HPOC_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

		/**
	 * The cached OCL expression body for the '{@link #validateHPOCProcedureActivityActEntryRelationshipProcedure(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HPOC Procedure Activity Act Entry Relationship Procedure</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHPOCProcedureActivityActEntryRelationshipProcedure(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HPOC_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

		/**
	 * The cached OCL invariant for the '{@link #validateHPOCProcedureActivityActEntryRelationshipProcedure(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HPOC Procedure Activity Act Entry Relationship Procedure</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHPOCProcedureActivityActEntryRelationshipProcedure(ProcedureActivityAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HPOC_PROCEDURE_ACTIVITY_ACT_ENTRY_RELATIONSHIP_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param procedureActivityAct The receiving '<em><b>Procedure Activity Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateProcedureActivityActCode(ProcedureActivityAct procedureActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PROCEDURE_ACTIVITY_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.PROCEDURE_ACTIVITY_ACT);
			try {
				VALIDATE_PROCEDURE_ACTIVITY_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PROCEDURE_ACTIVITY_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PROCEDURE_ACTIVITY_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(procedureActivityAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.PROCEDURE_ACTIVITY_ACT__PROCEDURE_ACTIVITY_ACT_CODE,
						 HPOCPlugin.INSTANCE.getString("ProcedureActivityActProcedureActivityActCode"),
						 new Object [] { procedureActivityAct }));
			}
			 
			return false;
		}
		return true;
	}

} // ProcedureActivityActOperations