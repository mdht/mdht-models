/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Planned Coverage</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage#validatePlannedCoverageTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage#validatePlannedCoverageClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage#validatePlannedCoverageMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage#validatePlannedCoverageId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage#validatePlannedCoverageCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage#validatePlannedCoverageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage#validatePlannedCoverageStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage#validatePlannedCoverageStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage#validatePlannedCoverageEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage#validatePlannedCoverageAuthorParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Author Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage#validatePlannedCoverageEntryRelationshipActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Entry Relationship Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage#validatePlannedCoverageEntryRelationshipActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Entry Relationship Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage#validatePlannedCoverageEntryRelationshipActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Entry Relationship Act Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage#validatePlannedCoverageEntryRelationshipActCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Entry Relationship Act Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage#validatePlannedCoverageEntryRelationshipActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Entry Relationship Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage#validatePlannedCoverageEntryRelationshipActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Entry Relationship Act Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage#validatePlannedCoverageEntryRelationshipActStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Entry Relationship Act Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage#validatePlannedCoverageEntryRelationshipTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Entry Relationship Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlannedCoverage#validatePlannedCoverageEntryRelationshipAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Entry Relationship Act</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlannedCoverageOperations extends ClinicalStatementOperations {
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
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
	protected PlannedCoverageOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedCoverageTemplateId(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedCoverageTemplateId(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_COVERAGE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.129')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedCoverageTemplateId(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedCoverageTemplateId(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PLANNED_COVERAGE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedCoverage The receiving '<em><b>Planned Coverage</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedCoverageTemplateId(PlannedCoverage plannedCoverage,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PlannedCoveragePlannedCoverageTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_PLANNED_COVERAGE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_COVERAGE);
			try {
				VALIDATE_PLANNED_COVERAGE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PLANNED_COVERAGE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PLANNED_COVERAGE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(plannedCoverage)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_COVERAGE__PLANNED_COVERAGE_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("PlannedCoveragePlannedCoverageTemplateId"),
						 new Object [] { plannedCoverage }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedCoverageClassCode(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedCoverageClassCode(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_COVERAGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedCoverageClassCode(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedCoverageClassCode(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PLANNED_COVERAGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedCoverage The receiving '<em><b>Planned Coverage</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedCoverageClassCode(PlannedCoverage plannedCoverage, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PlannedCoveragePlannedCoverageClassCode","ERROR");
    
  	  
  	  
		if (VALIDATE_PLANNED_COVERAGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_COVERAGE);
			try {
				VALIDATE_PLANNED_COVERAGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PLANNED_COVERAGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PLANNED_COVERAGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(plannedCoverage)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_COVERAGE__PLANNED_COVERAGE_CLASS_CODE,
						 ConsolPlugin.INSTANCE.getString("PlannedCoveragePlannedCoverageClassCode"),
						 new Object [] { plannedCoverage }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedCoverageMoodCode(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedCoverageMoodCode(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_COVERAGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::INT";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedCoverageMoodCode(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedCoverageMoodCode(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PLANNED_COVERAGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedCoverage The receiving '<em><b>Planned Coverage</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedCoverageMoodCode(PlannedCoverage plannedCoverage, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PlannedCoveragePlannedCoverageMoodCode","ERROR");
    
  	  
  	  
		if (VALIDATE_PLANNED_COVERAGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_COVERAGE);
			try {
				VALIDATE_PLANNED_COVERAGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PLANNED_COVERAGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PLANNED_COVERAGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(plannedCoverage)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_COVERAGE__PLANNED_COVERAGE_MOOD_CODE,
						 ConsolPlugin.INSTANCE.getString("PlannedCoveragePlannedCoverageMoodCode"),
						 new Object [] { plannedCoverage }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedCoverageId(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedCoverageId(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_COVERAGE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (( not self.id->isEmpty()) )";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedCoverageId(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedCoverageId(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PLANNED_COVERAGE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedCoverage The receiving '<em><b>Planned Coverage</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedCoverageId(PlannedCoverage plannedCoverage, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PlannedCoveragePlannedCoverageId","ERROR");
    
  	  
  	  
		if (VALIDATE_PLANNED_COVERAGE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_COVERAGE);
			try {
				VALIDATE_PLANNED_COVERAGE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PLANNED_COVERAGE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PLANNED_COVERAGE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(plannedCoverage)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_COVERAGE__PLANNED_COVERAGE_ID,
						 ConsolPlugin.INSTANCE.getString("PlannedCoveragePlannedCoverageId"),
						 new Object [] { plannedCoverage }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedCoverageCodeP(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedCoverageCodeP(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_COVERAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedCoverageCodeP(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedCoverageCodeP(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PLANNED_COVERAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedCoverage The receiving '<em><b>Planned Coverage</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedCoverageCodeP(PlannedCoverage plannedCoverage, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PlannedCoveragePlannedCoverageCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_PLANNED_COVERAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_COVERAGE);
			try {
				VALIDATE_PLANNED_COVERAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PLANNED_COVERAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PLANNED_COVERAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(plannedCoverage)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_COVERAGE__PLANNED_COVERAGE_CODE_P,
						 ConsolPlugin.INSTANCE.getString("PlannedCoveragePlannedCoverageCodeP"),
						 new Object [] { plannedCoverage }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.PlannedCoverageCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.PlannedCoverageCodeP", passToken);
				}
				passToken.add(plannedCoverage);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedCoverageCode(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedCoverageCode(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_COVERAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '48768-6' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedCoverageCode(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedCoverageCode(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PLANNED_COVERAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedCoverage The receiving '<em><b>Planned Coverage</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedCoverageCode(PlannedCoverage plannedCoverage, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.PlannedCoverageCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(plannedCoverage)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PlannedCoveragePlannedCoverageCode","ERROR");
    
  	  
  	  
		if (VALIDATE_PLANNED_COVERAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_COVERAGE);
			try {
				VALIDATE_PLANNED_COVERAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PLANNED_COVERAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PLANNED_COVERAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(plannedCoverage)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_COVERAGE__PLANNED_COVERAGE_CODE,
						 ConsolPlugin.INSTANCE.getString("PlannedCoveragePlannedCoverageCode"),
						 new Object [] { plannedCoverage }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedCoverageStatusCode(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedCoverageStatusCode(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_COVERAGE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'active')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedCoverageStatusCode(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedCoverageStatusCode(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PLANNED_COVERAGE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedCoverage The receiving '<em><b>Planned Coverage</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedCoverageStatusCode(PlannedCoverage plannedCoverage,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PlannedCoveragePlannedCoverageStatusCode","ERROR");
    
  	  
  	  
		if (VALIDATE_PLANNED_COVERAGE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_COVERAGE);
			try {
				VALIDATE_PLANNED_COVERAGE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PLANNED_COVERAGE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PLANNED_COVERAGE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(plannedCoverage)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_COVERAGE__PLANNED_COVERAGE_STATUS_CODE,
						 ConsolPlugin.INSTANCE.getString("PlannedCoveragePlannedCoverageStatusCode"),
						 new Object [] { plannedCoverage }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedCoverageStatusCodeP(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedCoverageStatusCodeP(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_COVERAGE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedCoverageStatusCodeP(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedCoverageStatusCodeP(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PLANNED_COVERAGE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedCoverage The receiving '<em><b>Planned Coverage</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedCoverageStatusCodeP(PlannedCoverage plannedCoverage,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PlannedCoveragePlannedCoverageStatusCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_PLANNED_COVERAGE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_COVERAGE);
			try {
				VALIDATE_PLANNED_COVERAGE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PLANNED_COVERAGE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PLANNED_COVERAGE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(plannedCoverage)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_COVERAGE__PLANNED_COVERAGE_STATUS_CODE_P,
						 ConsolPlugin.INSTANCE.getString("PlannedCoveragePlannedCoverageStatusCodeP"),
						 new Object [] { plannedCoverage }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedCoverageEntryRelationship(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Entry Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedCoverageEntryRelationship(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedCoverageEntryRelationship(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Entry Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedCoverageEntryRelationship(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedCoverage The receiving '<em><b>Planned Coverage</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedCoverageEntryRelationship(PlannedCoverage plannedCoverage,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PlannedCoveragePlannedCoverageEntryRelationship","ERROR");
    
  	  
  	  
		if (VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_COVERAGE);
			try {
				VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(plannedCoverage)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_COVERAGE__PLANNED_COVERAGE_ENTRY_RELATIONSHIP,
						 ConsolPlugin.INSTANCE.getString("PlannedCoveragePlannedCoverageEntryRelationship"),
						 new Object [] { plannedCoverage }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedCoverageAuthorParticipation(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Author Participation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedCoverageAuthorParticipation(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_COVERAGE_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(consol::AuthorParticipation))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedCoverageAuthorParticipation(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Author Participation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedCoverageAuthorParticipation(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PLANNED_COVERAGE_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedCoverage The receiving '<em><b>Planned Coverage</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePlannedCoverageAuthorParticipation(PlannedCoverage plannedCoverage,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PlannedCoveragePlannedCoverageAuthorParticipation","INFO");
    
  	  
  	  
		if (VALIDATE_PLANNED_COVERAGE_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_COVERAGE);
			try {
				VALIDATE_PLANNED_COVERAGE_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PLANNED_COVERAGE_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PLANNED_COVERAGE_AUTHOR_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(plannedCoverage)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_COVERAGE__PLANNED_COVERAGE_AUTHOR_PARTICIPATION,
						 ConsolPlugin.INSTANCE.getString("PlannedCoveragePlannedCoverageAuthorParticipation"),
						 new Object [] { plannedCoverage }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedCoverageEntryRelationshipActClassCode(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Entry Relationship Act Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedCoverageEntryRelationshipActClassCode(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).act->excluding(null)->reject(classCode=vocab::x_ActClassDocumentEntryAct::ACT)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedCoverageEntryRelationshipActClassCode(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Entry Relationship Act Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedCoverageEntryRelationshipActClassCode(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedCoverage The receiving '<em><b>Planned Coverage</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePlannedCoverageEntryRelationshipActClassCode(PlannedCoverage plannedCoverage,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PlannedCoveragePlannedCoverageEntryRelationshipActClassCode","ERROR");
    
  	  
  	  
		if (VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_COVERAGE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(plannedCoverage);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_COVERAGE__PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_CLASS_CODE,
						 ConsolPlugin.INSTANCE.getString("PlannedCoveragePlannedCoverageEntryRelationshipActClassCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedCoverageEntryRelationshipActMoodCode(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Entry Relationship Act Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedCoverageEntryRelationshipActMoodCode(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).act->excluding(null)->reject(moodCode=vocab::x_DocumentActMood::INT)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedCoverageEntryRelationshipActMoodCode(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Entry Relationship Act Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedCoverageEntryRelationshipActMoodCode(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedCoverage The receiving '<em><b>Planned Coverage</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePlannedCoverageEntryRelationshipActMoodCode(PlannedCoverage plannedCoverage,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PlannedCoveragePlannedCoverageEntryRelationshipActMoodCode","ERROR");
    
  	  
  	  
		if (VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_COVERAGE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(plannedCoverage);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_COVERAGE__PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_MOOD_CODE,
						 ConsolPlugin.INSTANCE.getString("PlannedCoveragePlannedCoverageEntryRelationshipActMoodCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedCoverageEntryRelationshipActId(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Entry Relationship Act Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedCoverageEntryRelationshipActId(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).act->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (( not id->isEmpty()) ))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedCoverageEntryRelationshipActId(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Entry Relationship Act Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedCoverageEntryRelationshipActId(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedCoverage The receiving '<em><b>Planned Coverage</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePlannedCoverageEntryRelationshipActId(PlannedCoverage plannedCoverage,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PlannedCoveragePlannedCoverageEntryRelationshipActId","ERROR");
    
  	  
  	  
		if (VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_COVERAGE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(plannedCoverage);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_COVERAGE__PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_ID,
						 ConsolPlugin.INSTANCE.getString("PlannedCoveragePlannedCoverageEntryRelationshipActId"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedCoverageEntryRelationshipActCodeP(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Entry Relationship Act Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #validatePlannedCoverageEntryRelationshipActCodeP(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).act->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedCoverageEntryRelationshipActCodeP(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Entry Relationship Act Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedCoverageEntryRelationshipActCodeP(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedCoverage The receiving '<em><b>Planned Coverage</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePlannedCoverageEntryRelationshipActCodeP(PlannedCoverage plannedCoverage,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PlannedCoveragePlannedCoverageEntryRelationshipActCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_COVERAGE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(plannedCoverage);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_COVERAGE__PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_CODE_P,
						 ConsolPlugin.INSTANCE.getString("PlannedCoveragePlannedCoverageEntryRelationshipActCodeP"),
						 new Object [] { eObject }));
				}
				
				if (context != null) {
					// generate a pass token for my dependent constraints to short-circuit or filter results
					Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.PlannedCoverageEntryRelationshipActCodeP");
					if (passToken == null) {
						// anticipate a reasonably healthy model
						passToken = new java.util.ArrayList<Object>(3);
						context.put("org.openhealthtools.mdht.uml.cda.consol.PlannedCoverageEntryRelationshipActCodeP", passToken);
					}
					passToken.addAll(oclResultSet);
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedCoverageEntryRelationshipActCode(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Entry Relationship Act Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedCoverageEntryRelationshipActCode(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).act->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.221.5' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedCoverageEntryRelationshipActCode(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Entry Relationship Act Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedCoverageEntryRelationshipActCode(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedCoverage The receiving '<em><b>Planned Coverage</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePlannedCoverageEntryRelationshipActCode(PlannedCoverage plannedCoverage,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PlannedCoveragePlannedCoverageEntryRelationshipActCode","ERROR");
    
  	  
  	  
		if (VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_COVERAGE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(plannedCoverage);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			Object passFilter = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.PlannedCoverageEntryRelationshipActCodeP");
			if (passFilter instanceof Collection<?>) {
				// filter my query results
				oclResultSet = new ArrayList<EObject>(oclResultSet);
				oclResultSet.removeAll((Collection<?>) passFilter);
			}
	  		
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_COVERAGE__PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_CODE,
						 ConsolPlugin.INSTANCE.getString("PlannedCoveragePlannedCoverageEntryRelationshipActCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedCoverageEntryRelationshipActStatusCode(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Entry Relationship Act Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedCoverageEntryRelationshipActStatusCode(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).act->excluding(null)->reject((statusCode.oclIsUndefined() or statusCode.isNullFlavorUndefined()) implies (not statusCode.oclIsUndefined() and statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'active'))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedCoverageEntryRelationshipActStatusCode(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Entry Relationship Act Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedCoverageEntryRelationshipActStatusCode(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedCoverage The receiving '<em><b>Planned Coverage</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePlannedCoverageEntryRelationshipActStatusCode(PlannedCoverage plannedCoverage,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PlannedCoveragePlannedCoverageEntryRelationshipActStatusCode","ERROR");
    
  	  
  	  
		if (VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_COVERAGE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(plannedCoverage);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_COVERAGE__PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_STATUS_CODE,
						 ConsolPlugin.INSTANCE.getString("PlannedCoveragePlannedCoverageEntryRelationshipActStatusCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedCoverageEntryRelationshipActStatusCodeP(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Entry Relationship Act Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedCoverageEntryRelationshipActStatusCodeP(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).act->excluding(null)->reject((statusCode.oclIsUndefined() or statusCode.isNullFlavorUndefined()) implies (not statusCode.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedCoverageEntryRelationshipActStatusCodeP(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Entry Relationship Act Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedCoverageEntryRelationshipActStatusCodeP(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedCoverage The receiving '<em><b>Planned Coverage</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePlannedCoverageEntryRelationshipActStatusCodeP(PlannedCoverage plannedCoverage,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PlannedCoveragePlannedCoverageEntryRelationshipActStatusCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_COVERAGE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(plannedCoverage);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_COVERAGE__PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT_STATUS_CODE_P,
						 ConsolPlugin.INSTANCE.getString("PlannedCoveragePlannedCoverageEntryRelationshipActStatusCodeP"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedCoverageEntryRelationshipTypeCode(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Entry Relationship Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedCoverageEntryRelationshipTypeCode(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedCoverageEntryRelationshipTypeCode(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Entry Relationship Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedCoverageEntryRelationshipTypeCode(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedCoverage The receiving '<em><b>Planned Coverage</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePlannedCoverageEntryRelationshipTypeCode(PlannedCoverage plannedCoverage,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PlannedCoveragePlannedCoverageEntryRelationshipTypeCode","ERROR");
    
  	  
  	  
		if (VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_COVERAGE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(plannedCoverage);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_COVERAGE__PLANNED_COVERAGE_ENTRY_RELATIONSHIP_TYPE_CODE,
						 ConsolPlugin.INSTANCE.getString("PlannedCoveragePlannedCoverageEntryRelationshipTypeCode"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedCoverageEntryRelationshipAct(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Entry Relationship Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedCoverageEntryRelationshipAct(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->one(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(cda::Act)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedCoverageEntryRelationshipAct(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Coverage Entry Relationship Act</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedCoverageEntryRelationshipAct(PlannedCoverage, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedCoverage The receiving '<em><b>Planned Coverage</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validatePlannedCoverageEntryRelationshipAct(PlannedCoverage plannedCoverage,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"PlannedCoveragePlannedCoverageEntryRelationshipAct","ERROR");
    
  	  
  	  
		if (VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PLANNED_COVERAGE);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(plannedCoverage);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.PLANNED_COVERAGE__PLANNED_COVERAGE_ENTRY_RELATIONSHIP_ACT,
						 ConsolPlugin.INSTANCE.getString("PlannedCoveragePlannedCoverageEntryRelationshipAct"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // PlannedCoverageOperations
