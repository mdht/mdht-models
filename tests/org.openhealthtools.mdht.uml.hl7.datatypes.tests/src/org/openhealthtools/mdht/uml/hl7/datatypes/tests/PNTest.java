/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.datatypes.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.CDAValidationTest;
import org.eclipse.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.eclipse.mdht.uml.hl7.datatypes.ENXP;
import org.eclipse.mdht.uml.hl7.datatypes.PN;
import org.eclipse.mdht.uml.hl7.datatypes.operations.PNOperations;
import org.eclipse.mdht.uml.hl7.vocab.EntityNamePartQualifier;
import org.junit.Test;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>PN</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.PN#validateInvariant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Invariant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PNTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateInvariant() {
		OperationsTestCase<PN> validateInvariantTestCase = new OperationsTestCase<PN>(
			"validateInvariant", operationsForOCL.getOCLValue("VALIDATE_INVARIANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			/*
			 * (non-Javadoc)
			 *
			 * @see org.eclipse.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addFailTests()
			 * self.delimiter->forAll(enxp : datatypes::ENXP | not enxp.qualifier->includes(vocab::EntityNamePartQualifier::LS)) and
			 * self.family->forAll(enxp : datatypes::ENXP | not enxp.qualifier->includes(vocab::EntityNamePartQualifier::LS)) and
			 * self.given->forAll(enxp : datatypes::ENXP | not enxp.qualifier->includes(vocab::EntityNamePartQualifier::LS)) and
			 * self.prefix->forAll(enxp : datatypes::ENXP | not enxp.qualifier->includes(vocab::EntityNamePartQualifier::LS)) and
			 * self.suffix->forAll(enxp : datatypes::ENXP | not enxp.qualifier->includes(vocab::EntityNamePartQualifier::LS))
			 * <
			 */
			@Override
			public void addFailTests() {
				this.addFailTest(new FailTest() {

					@Override
					public void updateToFail(PN target) {
						target.addText("delimiter");
						ENXP enxp = DatatypesFactory.eINSTANCE.createENXP();
						enxp.getQualifiers().add(EntityNamePartQualifier.LS);
						target.getDelimiters().add(enxp);
					}
				});

				this.addFailTest(new FailTest() {

					@Override
					public void updateToFail(PN target) {
						target.addText("family");
						target.addText("delimiter");
						ENXP enxp = DatatypesFactory.eINSTANCE.createENXP();
						enxp.getQualifiers().add(EntityNamePartQualifier.LS);
						target.getFamilies().add(enxp);
					}
				});

				this.addFailTest(new FailTest() {

					@Override
					public void updateToFail(PN target) {
						target.addText("Given");
						target.addText("delimiter");
						ENXP enxp = DatatypesFactory.eINSTANCE.createENXP();
						enxp.getQualifiers().add(EntityNamePartQualifier.LS);
						target.getGivens().add(enxp);
					}
				});

				this.addFailTest(new FailTest() {

					@Override
					public void updateToFail(PN target) {
						target.addText("Prefix");
						target.addText("delimiter");
						ENXP enxp = DatatypesFactory.eINSTANCE.createENXP();
						enxp.getQualifiers().add(EntityNamePartQualifier.LS);
						target.getPrefixes().add(enxp);
					}
				});

				this.addFailTest(new FailTest() {

					@Override
					public void updateToFail(PN target) {
						target.addText("suffix");
						target.addText("delimiter");
						ENXP enxp = DatatypesFactory.eINSTANCE.createENXP();
						enxp.getQualifiers().add(EntityNamePartQualifier.LS);
						target.getSuffixes().add(enxp);
					}
				});

			}

			@Override
			public void addPassTests() {
				this.addPassTest(new PassTest() {

					@Override
					public void updateToPass(PN target) {
						target.addText("delimiter");
						ENXP enxp = DatatypesFactory.eINSTANCE.createENXP();
						enxp.getQualifiers().add(EntityNamePartQualifier.AC);
						target.getDelimiters().add(enxp);
					}
				});

				this.addPassTest(new PassTest() {

					@Override
					public void updateToPass(PN target) {
						target.addText("family");
						target.addText("delimiter");
						ENXP enxp = DatatypesFactory.eINSTANCE.createENXP();
						enxp.getQualifiers().add(EntityNamePartQualifier.AC);
						target.getFamilies().add(enxp);
					}
				});

				this.addPassTest(new PassTest() {

					@Override
					public void updateToPass(PN target) {
						target.addText("Given");
						target.addText("delimiter");
						ENXP enxp = DatatypesFactory.eINSTANCE.createENXP();
						enxp.getQualifiers().add(EntityNamePartQualifier.AC);
						target.getGivens().add(enxp);
					}
				});

				this.addPassTest(new PassTest() {

					@Override
					public void updateToPass(PN target) {
						target.addText("Prefix");
						target.addText("delimiter");
						ENXP enxp = DatatypesFactory.eINSTANCE.createENXP();
						enxp.getQualifiers().add(EntityNamePartQualifier.AC);
						target.getPrefixes().add(enxp);
					}
				});

				this.addPassTest(new PassTest() {

					@Override
					public void updateToPass(PN target) {
						target.addText("suffix");
						target.addText("delimiter");
						ENXP enxp = DatatypesFactory.eINSTANCE.createENXP();
						enxp.getQualifiers().add(EntityNamePartQualifier.AC);
						target.getSuffixes().add(enxp);
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PNOperations.validateInvariant((PN) objectToTest, diagnostician, map);
			}

		};

		validateInvariantTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PNOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass().getDeclaredField(fieldName).get(this);
			} catch (Exception e) {
				oclValue = "NO OCL FOUND FOR PROPERTY " + fieldName;
			}
			return oclValue;
		}
	}

	/**
	*
	* @generated
	*/
	private static class ObjectFactory implements TestObjectFactory<PN> {

		public PN create() {
			return DatatypesFactory.eINSTANCE.createPN();
		}
	}

	/**
	*
	* @generated
	*/
	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	/**
	*
	* @generated
	*/
	private static ObjectFactory objectFactory = new ObjectFactory();

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	private static class ConstructorTestClass extends PNOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/

	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // PNOperations
