/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedures Section2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getProceduresSection2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='ProceduresSectionEntriesOptionalTemplateId ProceduresSection2HasProcedureActivity ProceduresSectionEntriesOptionalCode ProceduresSectionEntriesOptionalCodeP ProceduresSection2Title ProceduresSection2Text ProceduresSectionEntriesOptionalProcedureActivityProcedure ProceduresSectionEntriesOptionalProcedureActivityObservation ProceduresSectionEntriesOptionalProcedureActivityAct ProceduresSection2Entry' templateId.root='2.16.840.1.113883.10.20.22.2.7.1' templateId.extension='2014-06-09' nullFlavor='NI' constraints.validation.info='ProceduresSection2NullFlavor ProceduresSection2EntryProcedureActivityAct2 ProceduresSection2EntryProcedureActivityObservation2 ProceduresSection2EntryProcedureActivityProcedure2' constraints.validation.dependOn.ProceduresSectionEntriesOptionalCode='ProceduresSectionEntriesOptionalCodeP' constraints.validation.query='ProceduresSection2EntryProcedureActivityAct2 ProceduresSection2EntryProcedureActivityObservation2 ProceduresSection2EntryProcedureActivityProcedure2'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolProceduresSection2Entry constraints.validation.info='ProceduresSection2EntryProcedureActivityAct2 ProceduresSection2EntryProcedureActivityObservation2 ProceduresSection2EntryProcedureActivityProcedure2'"
 * @generated
 */
public interface ProceduresSection2 extends ProceduresSectionEntriesOptional2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor &lt;&gt; vocab::NullFlavor::NI implies self.getActs()-&gt;exists(a : cda::Act | a.oclIsKindOf(consol::ProcedureActivityAct)) or self.getObservations()-&gt;exists(o : cda::Observation | o.oclIsKindOf(consol::ProcedureActivityObservation)) or self.getProcedures()-&gt;exists(p : cda::Procedure | p.oclIsKindOf(consol::ProcedureActivityProcedure))'"
	 * @generated
	 */
	boolean validateProceduresSection2HasProcedureActivity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='isDefined(\'nullFlavor\')'"
	 * @generated
	 */
	boolean validateProceduresSection2NullFlavor(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateProceduresSection2Title(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.text.oclIsUndefined()'"
	 * @generated
	 */
	boolean validateProceduresSection2Text(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.nullFlavor &lt;&gt; vocab::NullFlavor::NI implies entry-&gt;exists(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))'"
	 * @generated
	 */
	boolean validateProceduresSection2Entry(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry-&gt;excluding(null)-&gt;reject(act-&gt;one(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::ProcedureActivityAct2)))'"
	 * @generated
	 */
	boolean validateProceduresSection2EntryProcedureActivityAct2(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry-&gt;excluding(null)-&gt;reject(observation-&gt;one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::ProcedureActivityObservation2)))'"
	 * @generated
	 */
	boolean validateProceduresSection2EntryProcedureActivityObservation2(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry-&gt;excluding(null)-&gt;reject(procedure-&gt;one(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(consol::ProcedureActivityProcedure2)))'"
	 * @generated
	 */
	boolean validateProceduresSection2EntryProcedureActivityProcedure2(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProceduresSection2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProceduresSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // ProceduresSection2
